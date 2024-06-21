package day21_arrays;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

       // int[] nums =new int [] {3, 4, 5, 7}; since we have curly brackets with values, in[] we don't need size
        //int[] nums =new int [4];since we DO NOT have curly brackets with values, in[] we do HAVE TO need size
        int[] nums = {3, 4, 5, 7};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Tradition loop: "+nums[i]);

        }
        System.out.println("____");
        // This foreach loop
        for(int each : nums){
            System.out.println("Foreach loop: "+each);

        }
        System.out.println();
        String [] classes = {"java", "softskills", "database", "api"};

        for(String eachElem:classes){
            System.out.println("Foreeach loop: " + eachElem);
        }

        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional loop: "+classes[i]);

        }

        System.out.println();

        double[] nums2 = {23, 43, 34, 2};
        for (double each :nums){
        System.out.println("Foreach loop: "+each );

    }
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Fori: "+nums2[i]);
        }

        String [] names =new String[4];
        for (String each : names){
            each = "Test";
            System.out.println(each);

        }
        System.out.println(Arrays.toString(names));
        for (int i = 0; i <names.length ; i++) {
            names[i]="Test";


        }System.out.println(Arrays.toString(names));

        }

}
