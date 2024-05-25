package day30_a_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
A bad pair is whenever the first number in the pair is bigger then the second number.
		Remove any bad pairs for the ArrayList and return the ArrayList with no bad pairs

		Note: The given ArrayList will always be an even number of elements, so each number always has one pair

		@param nums - Given ArrayList of numbers
		@return - ArrayList of numbers

		Ex:
			Input:
				{3, 4, 6, 1, 1, 10, 8, 7};
			Output:
				{3, 4, 1, 10};

			Bad pairs that were removed:

                		6, 1
                		8, 7

 */
public class BadPairs {
   public static ArrayList<Integer> pairs (ArrayList<Integer> list){
    ArrayList<Integer> goodList =new ArrayList<>();
    // bad pair --> i>i+1
       //  good pair --> i< i+1
       for (int i = 0; i < list.size(); i+=2) {
           if (list.get(i)<list.get(i+1)){
               goodList.add(list.get(i));
               goodList.add(list.get(i+1));
           }
       }
       return goodList;
   }

    public static void main(String[] args) {

       ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(3, 5, 2, 64, 23, 1234, 76, 23, 45, 2));
   pairs(nums);
        System.out.println(nums);

        System.out.println(pairs(nums));
   }
}
