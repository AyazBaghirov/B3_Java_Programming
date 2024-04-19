package day14_string;

public class StartAndEND {
    public static void main(String[] args) {

        String str = "Loopcamp";

        System.out.println(str.startsWith("Loop"));
        System.out.println(str.startsWith("loop"));

        System.out.println(str.startsWith("Loopcamp"));
        System.out.println(str.startsWith("Loopcamp!"));

        String str2 = "loop";

        System.out.println(str.startsWith(str2));// does the str starts with str2 which is Loop
        System.out.println(str.startsWith(" Loop"));
        System.out.println(   "Loop");
        System.out.println(str.startsWith(    "Loop"));

        String sentence = "today it was a JAVA day";
        System.out.println(sentence.startsWith("today it was "));
        System.out.println(sentence.startsWith("today it was aJAVA day "));
        System.out.println(sentence.startsWith("today "));
        System.out.println(sentence.startsWith("today"));

        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith(" day"));
        System.out.println(sentence.endsWith("  day"));
        System.out.println(sentence.endsWith(" was "));
        System.out.println(sentence.endsWith("JAVA"));
        System.out.println(sentence.endsWith("y"));

        System.out.println(sentence.startsWith("today it was a JAVA day"));
        System.out.println(sentence.endsWith("today it was a JAVA day"));

        boolean result1 = str.startsWith("Loop");
        boolean result2 = str.endsWith("camp");

        System.out.println(result1);
        System.out.println(result2);



    }
}
