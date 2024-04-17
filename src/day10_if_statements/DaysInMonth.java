package day10_if_statements;
/*
           create a int variable to represent the month number, where 1 is January and 12 is December.
       use the month number input to determine how many days are in that month.
       use the following data to help you determine the number of days in each month:

           Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
           Months that has 30 days: 4, 6, 9, 11
           Month that has 28 days: 2

           ex:
               12
               31 days

           ex:
               9
               3

  */
public class DaysInMonth {
    public static void main(String[] args) {
int months = 12;
boolean has31Days =months ==1 || months == 3 || months == 5|| months == 8 ||months == 10||months==12;
boolean has30Days = months == 4||months ==6 || months ==9|| months == 11;
boolean has28Days = months ==2;

if(has31Days){
    System.out.println("This month has 31 days");}
if (has30Days){
    System.out.println("This month has 30 days");}
if (has28Days){
    System.out.println("This month has 28 days");}


//above 3 single if statement will be executed separately.
        System.out.println("-----------------------------------");
        if(has31Days){
            System.out.println("This month has 31 days");}
        else if(has30Days){
            System.out.println("This month has 30 days");}
        else if (has28Days){
            System.out.println("This month has 28 days");}
        else {
            System.out.println("The number you gave is not in the range of 1 and 12");



    }
}
    }





