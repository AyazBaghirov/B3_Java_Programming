package day33_a_static;

import java.util.Arrays;

public class LoopcampStudent {

    String name;
    int groupNumber;

    static int batchNumber;
    static String [] teachers;
    static String schoolName;

    //STATIC BLOCK - it run ONLY ONE TIME
    static {
        batchNumber =3;
        teachers =new String[]{"Nadir", "Feyruz", "James", "Diana"};
        schoolName ="Loopcamp";
        printInfo();

    }
    public static void printInfo(){
        System.out.println("Schoool Info: ");
        System.out.println("\tSchool Name: "+schoolName);
        System.out.println("\tBatch Number: "+batchNumber);
        System.out.println("\tTeachers: "+ Arrays.toString(teachers));
    }
    public LoopcampStudent(String name, int groupNumber){
        this.name=name;
        this.groupNumber =groupNumber;

    }

    @Override
    public String toString() {
        return "Loopcamp Student info: " +
                "\n\tName: " + name  +
                "\n\tGroup Number: " + groupNumber;
    }
}
