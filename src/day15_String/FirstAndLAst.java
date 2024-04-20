package day15_String;

import java.util.Scanner;

public class FirstAndLAst {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = key.nextLine();

        System.out.println(0+sentence.charAt(0));//  this is not CONCATENATION happens if one side is STRING
        System.out.println(sentence.charAt(0));// here we don have concatenation or addition
        System.out.println(0+sentence.charAt(sentence.length()-1));

        System.out.println("First char: "+sentence.charAt(0));
        System.out.println("Last char: "+sentence.charAt(sentence.length()-1));
    }
}
