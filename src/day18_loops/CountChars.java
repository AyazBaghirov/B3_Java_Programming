package day18_loops;

public class CountChars {
    public static void main(String[] args) {
        String str = "2juMpdqwa5787Tb_sga";
        int upperCount = 0, lowerCount = 0, numCount = 0, others =0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCount++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCount++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {// 0 is different than 0
                numCount++;
            }else {
                others++;
            }


        }
        System.out.println("Uppercase letter Count = " + upperCount);
        System.out.println("lowercase letter Count = " + lowerCount);
        System.out.println("Number letter Count = " + numCount);
        System.out.println("Other letter Count = " + others);
    }
}
