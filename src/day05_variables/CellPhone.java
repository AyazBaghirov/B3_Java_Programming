package day05_variables;

/*
    create a class CellPhone
    create a main method
    declare and assign these variables:
        brand, model, color, price, storage, hasCamera, sim(char A, B, C)

    Print all the variables

        sample data: apple, iphone 10, black, 1000.99, 128, true, A
 */

public class CellPhone {
    public static void main(String[] args){

        int numOfAplles=20;

        System.out.println(" i have "+numOfAplles+"apples");
        System.out.println(" i have "+15+"apples");
        System.out.println(" i have "+15+"apples");
        System.out.println(" i have "+15+"apples");
        System.out.println(" i have "+15+"apples");
        System.out.println(" i have "+15+"apples");
        System.out.println(" i have "+15+"apples");
        System.out.println(" i have "+15+"apples");
//
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");
//        System.out.println(" i have "+15+"apples");

        String brand ="Iphone";
        String model = "Iphone 14 Pro";
        String color = "Red";
        double price = 799.99;
        int storage  = 256;
        boolean hasCamera= true;
        char sim = 'A';

        System.out.println(" I have an" + model + " from "+ brand );
       // System.out.println("It came in the color $color and it has storage $storage GB");
        System.out.println("It came in the color " +color +" and it has storage " + storage +" GB");

        System.out.println("It came in the color " + color + " and it has " + storage + "GB");

        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + ", the total price is $" + price);


        String fullMessage = "I have an " + model+ " from " +brand+ ". \n It came in the color "+ color+ " and it has " +storage +" GB.For the sim type " + sim + " with a camera: " +hasCamera +", the total price is " +price;
        System.out.println(fullMessage);

    }
}
