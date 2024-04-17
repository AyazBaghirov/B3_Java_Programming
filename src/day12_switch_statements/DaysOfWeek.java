package day12_switch_statements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[]args ){
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a day number [1-7]: ");
        int num = key.nextInt();
        String message = "";
        switch(num){
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
                message = "The number is not between 1 and 7";


        }
        System.out.println(message);
    /*
     (a*2+a*3+a*7) == a(2+3+7)
     */

    }
}
