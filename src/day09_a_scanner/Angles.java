package day09_a_scanner;
/*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
 */

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angles number: ");

        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double total = angleOne+angleTwo+angleThree;

        boolean isTriangle =total == 180;
        boolean isCircle = total == 360;

        System.out.println(" It is a triangle: " +isTriangle);
        System.out.println(" It is a Circle: "+ isCircle);


    }
}
