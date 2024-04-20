package day15_String;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String str = "new example";
        System.out.println(str.isEmpty());// it has characters. So ---> false
        str = " ";
        System.out.println(str.isEmpty());// it still has an empty character. So ---> false
        str = "";
        System.out.println(str.isEmpty());// IT IS COMPELETLY EMPTY ---> No Single Character --> So, --> true

        System.out.println(str.length());//

         // 0 == 0
        if (str.length() == 0){
            System.out.println("No characters");

        }
        str = "Hello World";
        System.out.println(str.isBlank());

        str = " ";
        System.out.println(str.isBlank());// true
        System.out.println(str.isEmpty());// false

        str = "";
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("IS Blank: " + str.isBlank()); // Possible update in JAVA --> Normally it checks for empty space.
    }
}
