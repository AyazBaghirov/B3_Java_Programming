package day14_string;
/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Please, enter the website: ");
        String  url = input.next().toLowerCase();

        boolean isValidStart = url.startsWith("www.");
        System.out.println(isValidStart);

        boolean isValidEnd = url.endsWith(".com") || url.endsWith(".edu")|| url.endsWith(".gov")|| url.endsWith(".net")|| url.endsWith(".io");
        System.out.println(isValidEnd);

        if (isValidStart && isValidEnd){
            System.out.println("It is a valid website.");
        }else {
            System.out.println("It is invalid website.");

            if (isValidStart){
                System.out.println("It was invalid start");
            }
            if (isValidStart){
                System.out.println("It was invalid end");
            }
        }


    }
}
