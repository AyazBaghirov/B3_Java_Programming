package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        String year ="2024";

        // normal concatenation
        System.out.println("Current Year: "+year);
        System.out.println("Next year will be: "+(year+1));

        int yearInNum = Integer.parseInt(year); // int yearInNum =2024;
        System.out.println("Current year: "+yearInNum);
        System.out.println("Current year: "+(yearInNum+1));

        System.out.println("________________________");

        Scanner key = new Scanner(System.in);
        System.out.print("Enter you message in this format: i am $x years old: ");
        String str = key.nextLine();// i am 30 years old

        //in 5 years . i will be $x+5 years old

        String age = str.split(" ")[2];//"30"
        int ageInNum = Integer.parseInt(age);
        System.out.println("In 5 years, i will be " +(age+5)+" years old");
        System.out.println("In 5 years, i will be " +(ageInNum+5)+" years old");



    }
}
