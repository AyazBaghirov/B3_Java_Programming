package day10_if_statements;

public class IfElseExample {

    public static void main(String[] args) {

       /* int score =75;

        if (score >= 75) {
            System.out.println("Passing the exam!");
        }

        if (score < 75) {
            System.out.println("Failing the exam!");
        }

        */

        int score = 76;

        if (score >= 75) {
            System.out.println("Passing the exam!");
        } else {
            System.out.println("Failing the exam!");

        }
        // if score >90 --> print excellent else print keep working
        // what happens is score is == 90
        // what happens is score is < 90


        if (score == 90) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Keep Working!");

        }
        if (score < 90) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Keep Working!");

        }

        int year = 2029;
        boolean isLockDown = year == 2020 || year == 2021;
        if (isLockDown) {
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");


        } else {
            System.out.println("Stay at home.");
            System.out.println("Practice CODING");

        }

    }

    }
