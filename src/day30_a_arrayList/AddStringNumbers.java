package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
Task:
    	 	Create a method that will accept an ArrayList of numbers in String format,
		add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
		Ex:
			Input:
				“123”, “34”, “513”

			Output:
				[ 6, 7, 9 ]
 */
public class AddStringNumbers {

    public static ArrayList<Integer>    sumFromDtring (ArrayList<String>numsToSum){
        ArrayList<Integer>sums =new ArrayList<>();
        for (String each : numsToSum) {
            int sumOfEach = 0;
            for (String eachLetter : each.split("")) {//["1", "2", "3"]
                sumOfEach += Integer.parseInt(eachLetter); // "1" --->
            }
            sums.add(sumOfEach);
        }

        return sums;

    }

    public static void main(String[] args) {

        ArrayList<String>list  = new ArrayList<>(Arrays.asList("123", "34", "513"));
       ArrayList<Integer>summedVersion =  sumFromDtring(list);
        System.out.println(summedVersion);
        System.out.println(sumFromDtring(list));
    }
}
