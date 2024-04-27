package day15_String;
/*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
 */

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a message: ");
        String msg = input.nextLine();// input.nextLine().trim().toLowerCase();
        msg = msg.trim();
        String originalMsg = msg;// We have this container to hold the original message after trimmed.
        msg = msg.toLowerCase();

        System.out.println("You entered: "+msg);
        boolean hasBadWords = msg.contains("java is bad")|| msg.contains("quite")|| msg.contains("have fun")||msg.contains("crying");

        if (hasBadWords){
            System.out.println("Message failed to send");
        }else{
            System.out.println("\""+originalMsg + "\" was sent!");
        }

    }
}
