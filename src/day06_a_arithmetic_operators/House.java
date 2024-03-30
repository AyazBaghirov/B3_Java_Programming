package day06_a_arithmetic_operators;

public class House {

    /*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
    public static void main(String[] args){

        // We can declare assign  values to multible variables

        String houseType = "Penthouse", fullAdress = "1245 Test St";

        int numOfBedroom =4, numOfKitchen =2, zipCode = 54321;

        byte numOfBathroom = 3;

        boolean hasBasement=false;
        boolean hasAttic=false;
        boolean hasPool =true;
        boolean isOnSale = false;
        boolean hasPark = true;

        double costOfHouse = 999_999.99;
        double schoolRating= 4.9;

        String houseInfo = "The " + houseType + " on " + fullAdress + ", " + zipCode + " costs $" + costOfHouse + "\n\tThe " + houseType + " has the attic: " + hasAttic + ", \n\thas a pool: " + hasPool + " \n\tis on sale: " + isOnSale + ", \n\thas a park: " + hasPark + ". \n\tThe schools in the area have a rating of " + schoolRating;
        System.out.println(houseInfo);



    }
}
