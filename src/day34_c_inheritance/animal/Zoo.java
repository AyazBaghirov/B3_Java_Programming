package day34_c_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {


     Animal a1 =new Animal();
     a1.type ="General Animal";
     a1.numberOfLegs =0;
     a1.walk();
     //a1.roar();// Invalid - Parent class cannot access child class members.
     //a1.bark();//Invalid - Parent class cannot access child class members.


    Dog dog1 =new Dog();
    dog1.type="German Shepherd";
    dog1.walk();// Child class can access to Parent class members
    dog1.bark();// Child class can access its own memeber
    //dog1.roar(); Invalid beacuase neither Dog not Animal class has method called roar()




    Lion lion1 =new Lion();
    lion1.type ="Arctic Lion";
    lion1.walk();
    lion1.roar();
    //lion1.bark();Invalid beacuase neither lion not Animal class has method called bark()


    }
}