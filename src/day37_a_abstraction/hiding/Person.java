package day37_a_abstraction.hiding;

public class Person {
    String name = "Micky Mouse";

}

class SecretIdentity extends Person{

String name = "Winnie Poah";
// we created another "name" variable in the sb class
    // but it was already inherited from super class as well
    // so, now we are HIDDING the on from parent class

}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);
    }
}
