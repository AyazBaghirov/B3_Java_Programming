package day24_methods;

public class Email {
    public static void main(String[] args) {

buildEmail("Micky Mouse", "Gmail.com");
buildEmail("Tom Jerry", "Yahoo.com");


    }
    //Create a method that is called buildEmail and that accepts two String parameters
    //public static void buildEmail(){// Non-Parameterized method.
    // take the full name and then take FIRST caharacter of first name and full last name concantenet with domain
    public static void buildEmail(String fullName, String domain){//
        String email = fullName.toLowerCase().charAt(0)  + fullName.toLowerCase().substring(fullName.indexOf(" ")+1)
                + "@"
                +domain.toLowerCase();
        System.out.println(email);


    }

}
