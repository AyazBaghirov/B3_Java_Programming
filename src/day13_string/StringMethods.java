package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");

        //== ---> this operator compares the memory location
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name2 == name3
        );

        //How about if i want to compare the values of Strings
        //1 - .equals("")
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name2.equals(name3));

        System.out.println(name.equals("Micky"));
        System.out.println(name.equals(new String("Micky")));
        System.out.println("Micky".equals(name2));
        System.out.println("Micky".equals(name3));
        System.out.println(new String("Micky").equals(name2));
        System.out.println(new String("Micky").equals(name3));

        String str1 = new String("Micky");
        String str2 = new String("Micky");
        System.out.println(str1.equals(str2));

        System.out.println(new String("Micky Mouse").equals(new String("Mick Mouse")));

        System.out.println("today".equals("TODAY"));

        boolean compareNames = name.equals(name2);

        // 2 -
        String word1 = "Monday";
        String word2 = "MONDAY";
        String word3 = " MONDAY";
        System.out.println("Ignore Case and Compare: " + word1.equalsIgnoreCase(word2));
        System.out.println("Ignore Case and Compare: " + word1.equalsIgnoreCase(word3));



        System.out.println("---------");

        String last = "Loopcamp";
        int countLetters = last.length();
        System.out.println(last.length());
        System.out.println("count Letters: "+countLetters);

        //3 .lenght()
        System.out.println();


        System.out.println("4".equals("4"));
    }
}
