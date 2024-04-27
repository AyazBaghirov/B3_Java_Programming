package day15_String;

public class indexofMethod {
    public static void main(String[] args) {
        String s = "penpen";
        //          012

        // how can you get the last character
        System.out.println(s.charAt(s.length()-1));

        System.out.println(s.indexOf("p"));//0
        System.out.println(s.indexOf('p'));//0
        System.out.println(s.indexOf("pe"));//0

        System.out.println(s.indexOf("e"));//1
        System.out.println(s.indexOf('e'));//1

        System.out.println(s.indexOf("n"));//2
        System.out.println(s.indexOf('n'));//2

        System.out.println(s.indexOf("x")); // -1 you don't have it
        System.out.println(s.indexOf('x')); // -1 you don't have it
        System.out.println(s.indexOf("pem")); // -1 you don't have it
        System.out.println(s.indexOf("PEN")); // -1 you don't have it

        System.out.println("--------------");
        System.out.println(s.indexOf('p',1)); //3
        System.out.println(s.indexOf('p',2));// 3
        System.out.println(s.indexOf('p',3));// 3
        System.out.println(s.indexOf('p',4));// -1
        System.out.println(s.indexOf("pe",3));// 3
        System.out.println(s.indexOf("pen",2));// 3
        System.out.println(s.indexOf("pe",2));// 3
        System.out.println(s.indexOf("pe",7));// -1
        System.out.println(s.indexOf("pn"));// -1



    }
}
