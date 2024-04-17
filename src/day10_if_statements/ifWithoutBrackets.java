package day10_if_statements;

import javax.xml.transform.Source;

public class ifWithoutBrackets {
    public static void main(String[] args) {

        if (4 > 2) {
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if (1 > 2) System.out.println("hello2");// you can do this if you have ONE statement
        System.out.println("bye2");

        if (10 % 5 == 0) {
            System.out.println("divisible");
        } else {
            System.out.println("NOT divisible");
        }
            if (10 % 5 == 0)
                System.out.println("divisible");
            else
                System.out.println("NOT divisible");
        System.out.println("Testing"); // This does not have anything to do with the if else above

        // we CANNOT have a just SINGLE ELSE
        // else {
        // System.out.println("BYE3");



        if(5>2){
        System.out.println("Loopcamp");
        System.out.println("Loopcamp4");}
        else
        System.out.println("Loopcamp2");
        System.out.println("Loopcamp3");





    }
}
