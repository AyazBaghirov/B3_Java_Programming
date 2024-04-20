package day15_String;
/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */


import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = key.next().toUpperCase().trim();// tom --> TOM, tom --> TOM
        System.out.print("Please, enter your last name: ");
        String lastName = key.next().toUpperCase().trim();

        char first = firstName.charAt(0);// String first = ""+firstName.charAt(0);
        char last = lastName.charAt(0); // String last = ""+lastName.charAt(0);

        System.out.println(""+first+last);

    }
}
