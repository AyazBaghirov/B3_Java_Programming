package day30_b_custom_classes;

public class Item {
    //INSTANCE VARIABLE
    String name;
    double price;
// This is SPECIAL METHOD.
    // HELPS TO PRINT/ GET INTO FOR OBJECT DIRECTLY
    @Override// IF YOU WANT , YOU CAN REMOVE THIS "OVERRIDE" text
    public String toString() {
        return "Item: " +
                "\n\tname: " + name +
                "\n\tprice: " + price;
    }
    public String run(){
        return "hello";
    }
}
