package day35_inheritance.superDupper;

public class C extends A {
    int n;
    String str;
    public C(String str, int n, double d){
        super(d);
        this.str = str;
        this.n = n;
    }
}
