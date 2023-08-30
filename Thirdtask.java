    Regular Expression
----------------------------

//import statements user input and regular expression and matching operation
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Thirdtask {
	//main method entry point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        scanner.close();
      //isValidEmail method use to check the email valid invalid
        if (isValidEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
