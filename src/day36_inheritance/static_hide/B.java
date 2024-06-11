package day36_inheritance.static_hide;

public class B extends A {
    @Override
    public void instanceMethod() {
        System.out.println("Instance method from Child class");
    staticMethod();
    }

    //@Override static canot be overriden
    public static void staticMethod() {
        System.out.println("Static method from the Child class");

    }
}
