package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int [] arr = {30, 90, 60, 360, 180 };
        int [] arr1 = {180, 360, 30, 90, 60};

        // how to print arrays

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1 ));

        System.out.println("Compare before sorting: "+ Arrays.equals(arr,arr1));

        Arrays.sort(arr);
        Arrays.sort(arr1);

        System.out.println("Compare before sorting: "+ Arrays.equals(arr,arr1));

        //how to join the elements of an array

        String [] words = {"Java", "Selenium", "Api", "Db"};

        System.out.println(String.join(" ### ", words));

        // how to convert String into a String Array
        String str = "Today is Thursday";
        System.out.println(str.split(" "));
        System.out.println(Arrays.toString(str.split(" ")));

        System.out.println(str.toCharArray());//EXCEPTION: THIS WILL ACTUALLY PRINT IT AS A FUEL STRING
        System.out.println(Arrays.toString(str.toCharArray()));

    }
}
