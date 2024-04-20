package day14_string;
/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

        check if the username is matching

 */

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String expectedPassword = "loopcamp!";
        String expectedUsername = "java";

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your username: ");
        String username = key.next().toLowerCase();


        System.out.print("Please, enter you pasword: ");
        String passwordFromUser = key.next();

        if (passwordFromUser.length()>8
                && expectedPassword.equals(passwordFromUser)
                && username.equalsIgnoreCase(expectedUsername)){// JAVA vs java
            System.out.println("LOGGED IN");
        }

    }
}
