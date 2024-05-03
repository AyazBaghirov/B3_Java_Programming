package day20_nested_loops;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "a gentleman";  //aaeglmnnt
        String str2 = "elegant man";  //aaeglmnnt

       str1 = str1.toLowerCase().replace(" ","");
       str2 =  str2.toLowerCase().replace(" ","");

        System.out.println(str1);
        System.out.println(str2);

        if(str1.length()==str2.length()){
            for (int i = 0; i < str1.length(); i++) {
                char each =str1.charAt(i);


                str2 = str2.replaceFirst(each+"","");

            }
if (str2.isEmpty()){
    System.out.println("Anagram");
}else{
    System.out.println("Not Anagram");
}
        }else{
            System.out.println("Not Anagram");
        }



    }
}
