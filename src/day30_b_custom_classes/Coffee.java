package day30_b_custom_classes;
/*
package day30_b_custom_classes;

public class Item {

    // INSTANCE VARIABLES
    String name;
    double price;

    // This is SPECIAL METHOD.
    // HELPS TO PRINT / GET INTO FOR OBJECT DIRECTLY.
    @Override // If you want, you can remove this "Override" text
    public String toString() {
        return "Item: " +
                "\n\tprice: " + price +
                "\n\tname: " + name ;
 */
public class Coffee {
    double price ;
    double size;
    String brand;
    String type;

    @Override
    public String toString() {
        return "Coffee: " +
                "\n\tprice: $" + price +
                "\n\tsize: " + size +
                "\n\tbrand: "+ brand +
                "\n\ttype:" + type ;
    }
    public void drink() {
        System.out.println("Drinking "+type+ " of coffee.");
    }
    public void refill(double num){
        System.out.println("Refilling "+num+" oz");
        size+=num;

    }
}
