package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args){
        int b = 10;
        b++;// b=b+1 --Post increment , just standalone statement to increase value by 1

        System.out.println(b);//1 action: print the value of b

        b--; //b= b-1 Post decrement , just standalone statement to deccrease value by 1
        System.out.println(b); //1 action: print the value of b

        System.out.println(b++); // 2 actions : print/use and update
                                 // 1st use it
                                 // 2nd update
    }
}
