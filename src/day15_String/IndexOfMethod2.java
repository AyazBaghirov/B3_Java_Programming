package day15_String;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s = "javaxa";
        //          01234
        System.out.println(s.indexOf("a"));  // 1

        System.out.println(s.lastIndexOf("a"));//5

        System.out.println("--------");
        String s2 = "abcbcbcb";
        System.out.println(s2.indexOf('b'));  //1
        System.out.println(s2.lastIndexOf('b'));  // 7

        System.out.println("--------");
        System.out.println(s2.indexOf("cb")); //2
        System.out.println(s2.lastIndexOf("cb")); //6

        System.out.println("--------");
        System.out.println(s2.indexOf("cbd")); //-1
        System.out.println(s2.lastIndexOf("cbd")); //-1

        System.out.println("--------");
        System.out.println(s2.indexOf("bc")); //1
        System.out.println(s2.lastIndexOf("bc")); //5

        System.out.println("--------");
        System.out.println(s2.indexOf("bc",2)); //3
        System.out.println(s2.lastIndexOf("bc",2)); //1

        System.out.println("--------");
        String s3 = "ababababab";
        System.out.println(s3.indexOf("b",4 )); //5
        System.out.println(s3.lastIndexOf("b",4)); //3

        System.out.println("--------");
        System.out.println(s3.indexOf("ba",2 )); //3
        System.out.println(s3.lastIndexOf("ba",6)); //5

    }
}
