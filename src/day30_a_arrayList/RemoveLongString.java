package day30_a_arrayList;
/*
Create a method that will accept an ArrayList of Strings and an int.
		Remove any String elements that have less characters than the given number.
		Return the modified ArrayList of Strings


		@param list - Given ArrayList of Strings
		@param int - max number of characters
		@return - ArrayList of Strings


		Ex:

			Input:
				”{“one,”, “two”, “three, “four”, “five”, “six”}

			number:
				4

			Output:
				{“three, “four”, “five”}

 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    public  static ArrayList<String> keepLong (ArrayList<String> list, int num){
        ArrayList<String>updatedList = new ArrayList<>(list);

        updatedList.removeIf(each->each.length()<num);


        return updatedList;
    }

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(keepLong(list, 4));
        System.out.println(keepLong(list, 5));
        System.out.println(keepLong(list, 10));


    }

}