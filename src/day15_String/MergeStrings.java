package day15_String;
/*

    two Strings: hard code to have 3 characters each
    merge the Strings together

    ex:
        abc
        xyz

        output: axbycz

 */
public class MergeStrings {
    public static void main(String[] args) {

        String str1 ="abc";
        String str2 ="xyz";

        String merged = "";


       // merged = merged +str1.charAt(0)+str2.charAt(0);
        // merged +=str1.charAt(0);
        // merged +=str2.charAt(0);

        merged +=""+ str1.charAt(0)+str2.charAt(0);// merged = merged +str1.charAt(0)+str2.charAt(0);
        merged +=""+ str1.charAt(1)+str2.charAt(1);// merged = merged +str1.charAt(1)+str2.charAt(1);
        merged +=""+ str1.charAt(2)+str2.charAt(2);// merged = merged +str1.charAt(2)+str2.charAt(2);
        System.out.println(merged);

        String mergerNew = "";
        int i = 0;
        int j = 0;
        mergerNew +=""+str1.charAt(i++)+str2.charAt(j++);
        //             str1.charAt(i=0)+str2.charAt(j=0);
        mergerNew +=""+str1.charAt(i++)+str2.charAt(j++);
        //             str1.charAt(i=1)+str2.charAt(j=1);
        mergerNew +=""+str1.charAt(i++)+str2.charAt(j++);
        //             str1.charAt(i=2)+str2.charAt(j=2);
        System.out.println(mergerNew);


    }
}
