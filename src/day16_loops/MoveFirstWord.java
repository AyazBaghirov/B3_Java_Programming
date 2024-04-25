package day16_loops;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a sentence: ");

        String sentence = key.nextLine();
        sentence.trim();

        // Take the part from sentence -> .substring(0.indexOfFirstSpace
        //                        how do i get indexOfFirstSpace  --> .indexOf("")

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String restOfSentence = sentence.substring(sentence.indexOf(" ")).trim();
        //String restOfSentence = sentence.substring(sentence.indexOf(" ")+1);
        System.out.println(firstWord);

        System.out.println(restOfSentence+ " "+firstWord );

    }
}

