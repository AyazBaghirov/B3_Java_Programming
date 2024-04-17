package day09_a_scanner;
import java.util.Scanner;
/*
#1 - we need to have the import
 */
public class FirstScanner {
    public static void main(String[] args) {


        //Scanner Object declaration/ instantiation
        // Scanner input; ---> input is the object reference name

        Scanner input = new Scanner(System.in);


        System.out.println("Please, enter a number:");

        //#2 - we get the value for console
      int userNumber =  input.nextInt();// Return input as int ---> Therefore , i can assign it into int variable
        System.out.println("you entered: " +userNumber);


    }
}
