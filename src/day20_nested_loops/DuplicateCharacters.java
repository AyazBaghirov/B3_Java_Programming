package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {


        String str ="appleeeiihh";// p,e
        String checked ="";

        for (int i = 0; i < str.length(); i++) {

            char each1 = str.charAt(i);
            int count =0;
            if (checked.contains(each1+"")){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char each2 =str.charAt(j);

                if(each1==each2){
                    count++;
                }

            }

            if (count>=2){
                System.out.println(each1);
            }
            checked+=each1;

        }
    }
}
