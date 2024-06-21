package day23_multidimensional_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6 },
                {10, 20, 30}
        };


        double totalSum = 0;
        int totalElem = 0;

// OUTER LOOP will get each single dimensional array
        for(int [] eachSingleArray:nums){

            int sum =0;
            //INNER LOOP will get each element in SINGLE dimensional array
            for (int eachElem:eachSingleArray){

                sum+= eachElem;

            }
            totalSum += sum;
            totalElem +=eachSingleArray.length;

            System.out.println("Average of"+ Arrays.toString(eachSingleArray ) +"---"+sum/eachSingleArray.length);


        }
        System.out.println("2D array average: "+totalSum/totalElem);
    }
}
