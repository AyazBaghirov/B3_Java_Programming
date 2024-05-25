package day30_a_arrayList;
/*
Create a method that will take an ArrayList of numbers and remove any duplicates values.

		The method will return an ArrayList of unique elements.


		@param nums - The given ArrayList of numbers
		@return - ArrayList of numbers
		Ex:

			Input:
				{1, 3, 5, 1, 4, 5, 9};
			Output:
				{3, 4, 9};

			Hint: User the .removeIf(); method and .frequency(); from Collections class
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDublicateNumbers {

    public static ArrayList<Integer> uniqueList (ArrayList<Integer> nums){
        ArrayList<Integer> uniques =new ArrayList<>(nums);

        uniques.removeIf(each-> Collections.frequency(nums,each)>1);


        /*
        [1, 3, 5, 1, 4, 5, 9]
        1st
          1-> Collections.frequency([1, 3, 5, 4, 5, 9],1)  --- > 2 > 1
        2st
          3-> Collections.frequency([3, 5, 4, 5, 9],1) --- > 1 > 1
        3rd
          5-> Collections.frequency([3, 5, 4, 5, 9],1) --- > 2 > 1
        4th
          4-> Collections.frequency([3, 4, 9],1) --- > 1> 1
        5th
          9-> Collections.frequency([3, 4, 9],1) --- > 1> 1
         */

        return uniques;
    }

    public static void main(String[] args) {
        ArrayList<Integer>nums =new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(nums);
        System.out.println(uniqueList(nums));
        System.out.println(nums);

    }
}
