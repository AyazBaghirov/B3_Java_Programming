package day04_variables;

import java.sql.SQLOutput;

public class Fruits {
    public static void main(String [] args){

        int apples = 80;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This how many apples we have: " +70);// the value of 70 HARDCODED
        System.out.println("This how many apples we have: " +apples); // the value of apple is DYNAMICALLY used

        System.out.println(50+50);
// Note: Anything after FIRST String is CONCATENATION
        System.out.println("50"+50);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas: " + bananas);

        // REASSIGNMENT
        System.out.println("Sold out some of apples");
        apples = 30;// i reassigned container called appleto have 30
        System.out.println("Apples after selling: "+apples);

        int price = 15;
        System.out.println("The price of my 30 apples is $15"); //it is HARDCODED
        System.out.println("The price of my " + apples + " apples is $"+ price);



    }
}
