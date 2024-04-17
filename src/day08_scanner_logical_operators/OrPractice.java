package day08_scanner_logical_operators;

public class OrPractice {

    public static void main(String[] args){

        int apples = 5;
        int oranges = 10;

        System.out.println( apples>1 || oranges < 5 ); // since this is || first part is true. Actually don't need to check the 2nd side.
        // Only false && false can give false
        //                    true   || false
        //                          true
        System.out.println(apples>10 || oranges ==10);
        //                     false || true
        //                           true
        System.out.println(apples> 10 && oranges == 10); //since this is && first part is false. i actually don't need to check the 2nd side.
        // Because only true && true can give true
        //                     false  &&  true
        //                          false

    }
}
