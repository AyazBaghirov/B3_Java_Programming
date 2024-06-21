package day24_methods;
/*
unlock car
open the door
sit in the car
close the door
put the seatbelt on
start the engine
put into drive and go

 */

public class Car {
public static void unlockerCar(){
    System.out.println("Unlocking the car");
}
public  static void openDoor(){
    System.out.println("Opening the door");
}
public static void getInTheCar(){
    System.out.println("Siting in teh car");
    System.out.println("Closing the door");
}
public static void getready(){
    System.out.println("Put the seatbelt on");
    System.out.println("Check the mirrors");
    System.out.println("Put the music on");
    System.out.println("Put the navigation");
}
public static void startCar(){
    System.out.println("Starting car");
}
public static void driveAndGo(){
    System.out.println("Putting gear into D");
    System.out.println("Press gas to go forward");
}
public static void goInHurry(){
    unlockerCar();
    openDoor();
    getInTheCar();
    startCar();
    driveAndGo();

}

    public static void main(String[] args) {

    unlockerCar();
    unlockerCar();
    unlockerCar();
    openDoor();

    getInTheCar();
    getready();
        System.out.println("------");
        goInHurry();

    }
}

