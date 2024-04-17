package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName =   input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Are you employed? [true/false]");
        boolean isEmployed = input.nextBoolean();

        System.out.print("Are you student? [true/false]");
        boolean isStudent = input.nextBoolean();

        String personInfo = firstName + " "+lastName+"is employed: "+isEmployed+" and the person is a student: "+isStudent;
        System.out.print(personInfo);


        System.out.println("Your name is: " +firstName);
    }
}
