package day15_String;
/*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */

import java.security.PublicKey;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

      int wordOneLenght =  word1.length();
      int wordTwoLenght =  word2.length();
      int wordThreeLenght =  word3.length();


      if ((wordOneLenght>wordTwoLenght || wordOneLenght>wordThreeLenght) && word1.contains("a")){
          System.out.println(word1 + " is biggest and has the\"a\" in it");
      }else if (wordTwoLenght>wordOneLenght&&wordTwoLenght>wordThreeLenght && word2.contains("a")){
          System.out.println(word2 + " is biggest and has the\"a\" in it");
      }else if (wordThreeLenght>wordOneLenght && wordThreeLenght>wordTwoLenght && word3.contains("a")){
          System.out.println(word3 + " is biggest and has the\"a\" in it");
      }else{
          System.out.println("there is no single biggest word or biggest word does not have \"a\" in it");
      }
    }
}
