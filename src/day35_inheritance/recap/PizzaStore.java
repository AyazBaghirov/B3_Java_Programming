package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza p1 =new Pizza("Hello",5);   // small, medium, large

        // p1.size ="hello"; // Since it is encapsualted, cannot reach directly

        System.out.println(p1);

        Pizza p2 =new Pizza("Medium",5);
        System.out.println(p2);

        Pizza p3 =new Pizza("Medium",-1);
        System.out.println(p3
        );
    }
}
