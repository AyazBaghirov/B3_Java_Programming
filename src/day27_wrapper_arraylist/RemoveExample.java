package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        System.out.println(list.size());

        //let's add some data in it

        list.add("water");
        //list.add(3);// INVALID, because the datatype of my ArrayList is String.
        list.add("bread");
        list.add("juice");
        list.add("fruit");
        System.out.println(list);//[water, bread, juice, fruit]
        list.add(1,"rice");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);//[rice, bread, juice, fruit]

        System.out.println(list.remove(0)); //rice
        System.out.println(list);//[bread, juice, fruit]

        // list.remove(12); IndexOutOfBoundsException

        //remove last one.

        list.remove(list.size()-1);
        System.out.println(list);//[bread, juice]

        //remove by element
        list.remove("juice");
        System.out.println(list);//[bread]
        System.out.println(list.remove("water"));//Since there was not match it returned false
        list.add("banana");
        list.add("banana");
        System.out.println(list);
        list.remove("banana");// it will removed the First matched one.
        System.out.println(list);


    }
}
