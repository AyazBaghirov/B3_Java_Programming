package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String [] args){


        double num1 = 7;// the values datatype is int. Since we assigned it into double variable, it was converted AUTOMATICALLY into to double
        double num2 = 5;

        double addition = num1+num2;
        double subtraction = num1-num2;
        double multiplication = num1*num2;
        double division = num1/num2;
        double reminder = num1%num2; // module

        //TODO:
        System.out.println(num1+" + "+num2+"="+addition);
        System.out.println(num1+" - "+num2+"="+subtraction);
        System.out.println(num1+" * "+num2+"="+multiplication);
        System.out.println(num1+" / "+num2+"="+division);
        System.out.println(num1+" % "+num2+"="+reminder);

        num1 = 13;
        num2 = 5;

        System.out.println(num1+" % "+num2+" = "+reminder ); // module ---> 13/5 whatever is not DIVISIBLE will be the REMINDER

        int n1 = 7;
        int n2 = 5;

        int result=n1/n2;
        System.out.println(result);// 1.4 -->1

        System.out.println("---------------------------");
        System.out.println(3.2+1); // 4 or 4.2--output double 4.2

        int a=3;
        double d=4;//4.00
        System.out.println(a+d); // 7.0

        byte b = 3;
        short s = 7;
        System.out.println( b+s);// 10

        byte b2 = 3;
        short s2 = 7;

        short total = (short)(b2+s2); // by default anything smaller than int, will became as int after any

        System.out.println(total);

        int a1 = 4;
        int a2 = 5;
        double d2 = a1+a2;






    }
}
