package day36_inheritance.static_hide;

public class Game {
    public static void main(String[] args) {
        Sports.cheer(); // calling the cheer() method from the Sports class
        System.out.println();
        Soccer.cheer();
        // if there is not some method declared in the child class, it will still call the Parent
        // If there is same method declared in the child class,
              // it will call depending on whether you are using Parent class to cal the or Child class
                       //If you use Child class to call the same method, the one from Parent gets Hidden
    }
}
