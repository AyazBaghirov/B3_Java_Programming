package day32_custom_classes;
/*
    create a class called Food

       - data:

           name, quantity, unit price, total price
*/
/*
    - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here
*/

public class Food {
    // INSTANCE VARIABLES
    String name;
    int quatity;
    double unitPrice;
    double totalPrice;

    public Food(String name){
        this.name =name;

    }
    public Food (String name, int quatity){
        this(name);
        this.quatity =quatity;

    }

    public Food(String name, int quatity, double unitPrice){
        this(name,quatity);
        this.unitPrice =unitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
       // totalPrice =Math.round(unitPrice*quatity);
        totalPrice =unitPrice*quatity;

    }
    public String toString(){
        return "item: "+name+" - "+quatity+" x "+unitPrice+" = $"+totalPrice;
    }

}
