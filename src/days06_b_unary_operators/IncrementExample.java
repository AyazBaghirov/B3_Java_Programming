package days06_b_unary_operators;

public class IncrementExample {
    public static void  main(String [] args){

        int x = 0;
        System.out.println(x);
        x = x + 1; // took the value of x, which is 0 and then added 1 on it --> x = 0 + 1; -->x = 1
        System.out.println(x);
        x++;  // POST INCREMENT - increase it by only 1.
        System.out.println(x);

        ++x; // PRE INCREMENT - increase it by only '1.
        System.out.println(x); // 3

        System.out.println(++x); // 4 --> because it is PRE INCREMENT, it will increase it first and then you can use it
        // before used, update ->  x = 4;
        // now print

        System.out.println(++x);

        System.out.println(x);

        System.out.println(x++);// 4--> because it is POST INCREMENT , it will be used first and then increment
        // after update x=5
        System.out.println(x);



    }
}
