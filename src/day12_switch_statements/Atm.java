package day12_switch_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to ATM ***\nPlease, enter your carda and type your pincode");
        int userPinCode = input.nextInt();

        int expectedPin = 6789;
        double balance = 1_000_000.00;
        if (userPinCode == expectedPin) {
            System.out.println("You are logged in");

            System.out.println("Select the number for your need:");
            System.out.println("\t1-Check Balance");
            System.out.println("\t2-Withdraw");
            System.out.println("\t3-Deposit");
            System.out.println("\nYour choice: ");

            int option = input.nextInt();

            if (option == 1) {
                System.out.print("Your balance is $" + balance);
            } else if (option == 2) {
                System.out.print("How much do you want to withdraw? $");
                double witdrawAmiount = input.nextDouble();
                System.out.print("Stand By... Withdrawing $" + witdrawAmiount);
                balance -= witdrawAmiount;
                System.out.print("After the withdraw, your balance is $" +balance);
            } else if (option == 3) {
                System.out.print("Please, insert the money: $");
                double deposit = input.nextDouble();
                balance += deposit;
                System.out.print("After the deposit, your balance is $" +balance);

            } else {
                System.out.println("Invalid selection. Exiting the account");
            }


        } else {
            System.out.println("Invalid pincode. Come back tomorrow.");


        }
    }
}