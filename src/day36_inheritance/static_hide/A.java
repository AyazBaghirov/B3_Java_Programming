package day36_inheritance.static_hide;

public class A {
    public void instanceMethod() {
        System.out.println("Instance method from Parent class");
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("Static method from the Parent class");
        //instanceMethod(); // static accepts static only
    }
}
