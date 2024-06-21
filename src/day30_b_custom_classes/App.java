package day30_b_custom_classes;

public class App {

    //INSTANCE VARIABLES / DATA MEMEBERS
    //These are not in a method. They are directly in the Class level
    //Note: if variables are declared in Methods, they are called LOCAL VARIABLES
    String name;
    double version;
    boolean isFree;

    //This is method is INSTANCE METHOD - does not have "static" keyword
    // Each object will run its own version.
    public void run() {
        System.out.println(name+ " is running.");
    }

    public void update(){
        System.out.println(name+" is updating....");
        version +=1.1;
    }
}
