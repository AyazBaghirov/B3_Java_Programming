package day15_String;
/*

    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space
 */

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName =key.next().trim();
        System.out.println("Enter your last name: ");
        String lastName =key.next().trim();


        // TOM Jerry-->Tom Jerry
        // TOm jerry-->Tom Jerry

        String fixedFirstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase(); // TOM --> OM, MICKY -->ICKY
        String fixedLastName = (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(fixedFirstName+" "+fixedLastName);

    }
}
