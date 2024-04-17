package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Are you hungery? [true/false]: ");
        boolean isHungery = input.nextBoolean();

        // approach #1- Single if statement
        if (isHungery){
            System.out.println("You are hungery, so i will  get some food for you. ");
        }

        if (!isHungery){
            System.out.println("Great, then practice java");
        }

        // Approach #2- IF-ELSE statement
        if(isHungery){
            System.out.println("You are hungery, so i will  get some food for you. ");
        } else{
            System.out.println("Great, then practice java");
        }


        // Approach #3- IF-ELSE statement- same as above - just to show the syntaxwith NO BRACEKETS
        if(isHungery)
            System.out.println("You are hungery, so i will  get some food for you. ");
            //System.out.println("2nd statement");
         else
            System.out.println("Great, then practice java");

    }
}
