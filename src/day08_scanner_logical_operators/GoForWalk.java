package day08_scanner_logical_operators;

public class GoForWalk {
    /*
     Want to go for a walk
     We will go for a walk
           if it is not raining
           and the weather is above 70

 */
    public static void main(String[] args) {

        boolean isRaining = false;
        int temperature =80;

        System.out.println("Go for a walk: "+ (!isRaining && temperature>70));


        System.out.println(false||9>5);

    }
}
