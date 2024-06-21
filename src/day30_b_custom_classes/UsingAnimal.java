package day30_b_custom_classes;

import My_utilities.StringUtil;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println(new Animal().population);
        animal1.population= 10000000l;
        animal1.species= "Bird";

        System.out.println(animal1.population);
        System.out.println(animal1.species);

        new Animal().population =1000;

        System.out.println(new Animal());

        System.out.println("____________");
        System.out.println(animal1);

        // To be able to print object, i have to have toString method declared
        System.out.println(new Animal());


    }
}
