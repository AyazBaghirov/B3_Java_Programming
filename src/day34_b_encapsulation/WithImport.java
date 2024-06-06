package day34_b_encapsulation;
// Import all static thing in util package specifically Arrays class
// if you do static import, all the non-static things are not accessible

import My_utilities.ArrayUtil;
import My_utilities.StringUtil;

import java.util.Arrays;

import static My_utilities.StringUtil.*;
import static My_utilities.ArrayUtil.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class WithImport {
    public static void main(String[] args) {

        int [] a ={ 81, 23, 65, 33};
      //  Arrays.sort(a);
        sort(a);


        //System.out.println(Math.PI);
        System.out.println(PI);

      //  System.out.println(StringUtil.reverse(("java")));
        System.out.println(reverse("java"));

        ArrayUtil.minNumInArr(a);

       // System.out.println(Arrays.toString(a)); // Since this is a special method. Sometime it is instance method, that is why Java  here does not know if it is static version


    }
}
