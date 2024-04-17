package day09_a_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary? $");
        double salary = input.nextDouble();// 120,000.00

        System.out.println("How many hours do you work ina week? ");
        int hoursInWeek = input.nextInt();//40

        double hourlyRate = salary/(hoursInWeek*52);

        System.out.println("With the annualy salary of " + salary+ " and working for "+hoursInWeek+" hours in a week, you hourly rateis $"+hourlyRate);


    }
}
