package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] groups2 = new String[4][3]; // 2D array will hold total 4 SINGLE dimensional array which will have 3 elements in each

        System.out.println();
        String [][] groups = new String[4][];// 2D array will hold total 4 SINGLE dimensional array
        System.out.println(Arrays.deepToString(groups));

        String[] groupTwo = {"Diliara", "laura", "Alex"};
        groups[0] = groupTwo;

        System.out.println(Arrays.deepToString(groups));

        String [] groupThree = {"Alona", "Roma", "Kanan"};

        groups[2] = groupThree;

        System.out.println(Arrays.deepToString(groups));

        groups[3] = groupThree;

        System.out.println(Arrays.deepToString(groups));

        groups[1] = groups[0];
        System.out.println(Arrays.deepToString(groups));

        groups[3] = new String[] {"John","Mocky"};

        System.out.println(Arrays.deepToString(groups));

        System.out.println();
        //[[Diliara, laura, Alex], [Diliara, laura, Alex], [Alona, Roma, Kanan], [John, Mocky]]

        for (String [] each:groups){
            //System.out.println(Arrays.deepToString(each));
            for (String eachName:each){
                System.out.println(eachName);
            }
            System.out.println();
        }
    }
}
