package day12_switch_statements;
/*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What day do you want to know about? ");
        String day = input.next();
        String information = "";

        switch (day){
            case "Monday": // Mon, monday
            case "Mon":
            case "monday":
            case "MON":

                information ="We have mentor sessions.";
                break;
            case "Tuesday":
                information = "We don't have a class.";
                break;
            case "Wednesday":
                information = "We have JAVA classes.";
                break;
            case "Thursday": case "Tue": case "tuesday":
                information = "We have JAVA classes.";
                break;
            case "Friday":
                information = "We don't have a class";
                break;
            case "Saturday":
                information = "We have JAVA classes starting 9:30 AM.";
                break;
            case "Sunday":
                information = "We havee SOFTSKILLS class";
                break;
            default:
                information = "Not valid day of week";
        }

        System.out.println(information);
    }
}
