Exception Handling
---------------------------

import java.util.Scanner;
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
        int iresult=(int)result;
        return Math.round(iresult ); // Round to one decimal place
    }
}

public class Firsttask {
//main method
    public static void main(String[] args) {
    	double dnum1=0;
    	
    	double dnum2=0;
        if (args.length != 2) {
            System.out.println("Please provide two numbers as arguments.");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 1st value ");
             dnum1=sc.nextDouble();
            System.out.println("Enter the 2st value ");
             dnum2=sc.nextDouble();
          
            
        }
       try {
            Calculator calculator = new PowerCalculator();
            double result = calculator.power(dnum1, dnum2);
            int iresult=(int)result;
            String sresult="POWER("+dnum1+","+dnum2+")="+iresult;
            System.out.println("Result: " + sresult);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
