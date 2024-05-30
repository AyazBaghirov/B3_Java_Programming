package day31_custom_classes;

public class ThisKeyword {

   // instance variable
    int a=100;


    //                  local variable
    public ThisKeyword(int a){
      a=a;
      // how ican i make a difference between LOCAL and Instance variable if they have SAME names
        System.out.println(a);// This is LOCAL variable --> a

        System.out.println(this.a);// this INSTANCE variable --> a
        this.a =400;
    }

}
