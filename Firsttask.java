Exception Handling
---------------------------

//create interface 
interface Calculator {
    double power(double a, double b) throws NegativeNumberException;
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
//inherit interface 
class PowerCalculator implements Calculator {
    @Override
    public double power(double a, double b) throws NegativeNumberException {
        if (a < 0 || b < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        
        double result = Math.pow(a, b);
        return Math.round(result * 10) / 10.0; // Round to one decimal place
    }
}

public class Firsttask {
//main method
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }
        
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        
        try {
            Calculator calculator = new PowerCalculator();
            double result = calculator.power(num1, num2);
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}