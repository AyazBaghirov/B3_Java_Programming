package day05_variables;

public class RecapVariables
{
    public static void main(String[] args){
        //Declare Variables
        byte numberOfCoffeeCups;
        /*
        hell1@ - Cannot have any special characters  other than $ _ digit
        12test
        _34hello - we can start with
        staticTest - valid
        static - not valid, it is java reserve word
        Package - valid because it starts with capital P

         */
        double totalPriceofCoffee;
        int totalNumberOfStudentsInClass;
                // we can't use the variables because they DON"T have avalue yet
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceofCoffee);
//        System.out.println(totalNumberOfStudentsInClass);
// Assign values
        numberOfCoffeeCups = 2;
        totalNumberOfStudentsInClass=100;
        totalPriceofCoffee = 10.25;

                System.out.println(numberOfCoffeeCups);
        System.out.println(totalNumberOfStudentsInClass);
        System.out.println(totalPriceofCoffee);
        // print out like this: $numberofCoffeeCups*$totalNumberOfStudentsInClass
        System.out.println(numberOfCoffeeCups+"*"+totalNumberOfStudentsInClass);

        // Declare and Assign
        double temperature = 30.5;
        int javaday=5;
        System.out.println("\nToday the temperature was "+ temperature);
        System.out.println("It is Day "+javaday+" in java class");

    }
}
