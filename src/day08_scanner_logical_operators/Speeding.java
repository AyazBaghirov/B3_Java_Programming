package day08_scanner_logical_operators;

public class Speeding {
    /*
    create a class called Speeding, and write a program to determine if the car is speeding

            declare 3 variables:
            current speed, speed limit, speeding boolean

            print
            "Are you speeding? " true/false
 */
    public static void main(String[] args) {

        int currentSpeed = 50;
        int speedLimit = 20;
        boolean isSpeeding = currentSpeed>speedLimit;

        System.out.println("Are you speeding? " +isSpeeding);

        currentSpeed = 25;
        speedLimit = 25;
        isSpeeding = currentSpeed>speedLimit;

        System.out.println("Are you speeding? " +isSpeeding);


        currentSpeed = 26;
        speedLimit = 25;
        isSpeeding = currentSpeed>speedLimit+3;
        // lets say you can go 3 mph more than what is allowed

        System.out.println("Are you speeding? " +isSpeeding);


    }
}
