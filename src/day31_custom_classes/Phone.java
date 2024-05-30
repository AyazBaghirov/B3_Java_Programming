package day31_custom_classes;

public class Phone {
    String name;
    String brand ;
    int memory;
    double version;

    public Phone (String name){// name ="Iphone X"
        //this.name =name;// phone1.name =name;
        this.name =name; // phone1.name =name;


    }

    public Phone (String name, String brand, int memory, double version){
        this.name =name;
        this.brand =brand;
        this.memory =memory;
        this.version =version;
    }

    public Phone (String name, String brand){// name ="Iphone X"
        //this.name =name;// phone1.name =name;
        this.name =name; // phone1.name =name;
        this.brand =brand; // phone1.name =name;


    }
    @Override
    public String toString() {
        return "Phone: " +
                "\n\tname: " + name +
                "\n\tbrand: " + brand +
                "\n\tmemory: " + memory +
                "\n\tversion: " + version;
    }
}
