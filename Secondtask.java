    Classes and Objects
----------------------------
//we import user input classes and data storage 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//we define account class with three fields

class Account {
    int id;
    String accountNumber;
    double accountBalance;

    public Account(int id, String accountNumber, double accountBalance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
}
//define user class with five fields,thats user account information

class User {
    int id;
    String userName;
    String password;
    String email;
    Account account;
 
    public User(int id, String userName, String password, String email, Account account) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.account = account;
    }
}

public class Secondtask {
//this is n metheod program execution start here
	
    public static void main(String[] args) {
    	//we create object for scanner and this is user input
        Scanner scanner = new Scanner(System.in);
        //declare empty list and store the user information
        List<User> users = new ArrayList<>();
        //initilize an int variable
        int userIdCounter = 1;
       //enter the while loop
        while (true) {
        	//Show the console
            System.out.println("Select an option:");
            System.out.println("1. Create User");
            System.out.println("2. Show Users");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline
             //enter the customer details
            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account balance: ");
                    double accountBalance = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline

                    Account account = new Account(userIdCounter, accountNumber, accountBalance);
                    User newUser = new User(userIdCounter, userName, password, email, account);
                    users.add(newUser);
                    userIdCounter++;
                    System.out.println("User created successfully.");
                    break;

                case 2:
                    System.out.println("List of users:");
                    for (User user : users) {
                        System.out.println("User ID: " + user.id);
                        System.out.println("User Name: " + user.userName);
                        System.out.println("Email: " + user.email);
                        System.out.println("Account Number: " + user.account.accountNumber);
                        System.out.println("Account Balance: " + user.account.accountBalance);
                        
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
