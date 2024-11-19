package HOME_PRACTICE.Banking_System;

import java.util.Scanner;

public class Banking_System {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double accountBalance = 100;
        int choice = 0;

        do{
            System.out.println("****************************");
            System.out.println("Make a Choice");
            System.out.println("****************************\n");
            System.out.println("1. To Check Your Account Balance");
            System.out.println("2. To Deposit");
            System.out.println("3. To Withdraw");
            System.out.println("4. To Exit\n");
            System.out.println("****************************");

            System.out.println("So Make a Choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    AcctBalance(accountBalance);
                break;
                case 2:
                    // Deposit
                    accountBalance += Deposit();

                    // After Deposit new account balance display
                    AcctBalance(accountBalance);
                break;
                case 3:
                    //WithDraw
                    accountBalance -= WithDraw(accountBalance);

                    // After Deposit new account balance display
                    AcctBalance(accountBalance);
                break;
                case 4:
                    System.out.println("Thanks for Visiting!!");
                break;
                default:
                    System.out.println("Make a Valid Choice");
                break;
            }
        }while (choice != 4);
    }

    public static void AcctBalance(double accountBalance){

        System.out.println("Your Account Balance Is: "+accountBalance+"$\n");
    }

    public static double Deposit(){

        Scanner scan = new Scanner(System.in);

        double amount = 0;

        System.out.println("Enter Amount You Wish Deposit: ");
        amount = scan.nextDouble();

        // Preventing Negative Numbers
        if(amount > 0){
            return amount;
        }else {
            System.out.println("The Amount is Invalid. Negative Number Entered");
            return 0;
        }

    }

    public static double WithDraw(double accountBalance){

        Scanner scan = new Scanner(System.in);

        double amount = 0;

        System.out.println("Enter Amount to Withdraw: "+amount+"$");

        amount = scan.nextDouble();

        //  Managing How the user Withdraw
        if (amount > accountBalance){
            System.out.println("Account Insufficient");
            System.out.println("Refill Your Account");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount to Withdraw Invalid Please!");
            return 0;
        }else {
            return amount;
        }
    }
}
