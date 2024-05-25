package day30_a_arrayList;

import My_utilities.StringUtil;
import day29_arraylist.ArrayListWithMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    /*
        Reverse All

        Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
        @param words - Given ArrayList of Strings @return - ArrayList of Strings

        Ex:
            Input: {"ted", "talk", "learn"}
            Output: {"det", "klat", "nrael"}
 */
   public static ArrayList<String>  reverseAll (ArrayList<String> list){
       ArrayList<String>reversed =new ArrayList<>();
          for(String each :list){
//    String str ="";
//    for (int i = each.length()-1; i > 0; i--) {
//        str+= each.charAt(i);
//    }
//    reversed.add(str);
    reversed.add(StringUtil.reverse(each));
     }
          return reversed;

   }

    public static void main(String[] args) {

   ArrayList<String>list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(list);
        System.out.println(reverseAll(list));

        //Extra


        System.out.println(ArrayListWithMethods.getDaysOfWeek());
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
    }
}
