package day15_String;

public class CharMethod {
    public static void main(String[] args) {
        String str = "loop";
        //            0123
        //               (number of characters -1)
        //count char 4 characters
        //count

        String str2 = "loopcamp.!"; //--> str.lenght(); --->10
        //             0123456789

        String str3 = "Hello World!";//12
        //             01234567891011

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        char first = str.charAt(0); // The charAT(index); method returns us a SINGLE CHARACTER

        //System.out.println(str.charAt(4));// it gives StringIndexOutOfBoundsException error - and nothing in code after this line will run

       // System.out.println("Hello");
        String longWord = "d;lasl;fm;askfewjteu7t3jfdkslnk vdbvsdfbs sdbjksbf s vbsdbv";
        System.out.println(longWord.length());
        System.out.println(longWord.length()-1);
        System.out.println(longWord.charAt(longWord.length()-1));
        // can you get me the last 2nd character
        System.out.println(longWord.charAt(longWord.length()-2));

        System.out.println("Number of character: " + longWord.length());
        System.out.println("Last index of String: " + (longWord.length() -1));
        System.out.println("last character : " + longWord.charAt((longWord.length()-1)));





    }
}
