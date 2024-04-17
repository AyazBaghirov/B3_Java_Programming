package day07_relational_operators;

public class OperatorPractice4 {
    public static void main(String[] args) {

        int t = 100;// 101| 100| 101| 100
        int p = - ++t * -t-- / t++ + --t;
        //  p = -101  * -101 / 100 + 100  -----> 10201/100+100

        System.out.println("p: " + p);
        System.out.println("t: "+ t);
        int c = p%t;
        System.out.println("c: " + c);

    }
}
