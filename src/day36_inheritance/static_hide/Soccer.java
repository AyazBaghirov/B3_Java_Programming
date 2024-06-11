package day36_inheritance.static_hide;

public class Soccer extends Sports {
    //@Override Static methods do NOT get Overridden
    public static void cheer() {
        System.out.println("Cheering from the Child Class");
    }
    /*
      Note:
           it looks like we are overriding
           But we are NOT, because the method is - static

           we are hidden the cheer() method from parent class
     */
}