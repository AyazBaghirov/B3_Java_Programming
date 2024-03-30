package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args){
byte b= 40;
int i=b; // the byte value is automatically converted into int, because byte is SMALLER than int

        int i2=100;
        byte b2 =(byte) i2;// int is BIGGER than byte, so we must CAST. We CAST the int type variable -i2 to a byte type variable using (byte)

       // byte b3=100; // Here 100 is assigned to byte. We know that byte can hold 100

        System.out.println(i2);
        System.out.println(b2);

        int i3 =130;
        byte b3= (byte)i3;
        System.out.println(i3);
        System.out.println(b3);// Here 100 is assigned to byte. We know that byte can hold 100
         // byte

        long i4=14L;
        int l4= (int) i4;//



    }
}
