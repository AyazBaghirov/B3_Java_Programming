package day33_a_static;


import day32_custom_classes.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {



    Offer first =new Offer("Google","Texas", 125_000, true,15);
        System.out.println(first);

        ArrayList<Offer> offerList =new ArrayList<>();// created an ArrayList that will hold Offer objects
        offerList.add(first);
        offerList.add(new Offer("Amazon", "New York", 130_000.00,true,15));// added another object into Arraylist of Offer directly

        System.out.println("---------------------");
        System.out.println(offerList);

        Offer [] moreOffers ={new Offer("Apple", "Chicago", 140_000,false,10),
                new Offer("Tesla", "texas", 150_000,false,20),new Offer("Facebook", "Florida", 140_000,true,10)};

        System.out.println(Arrays.toString(moreOffers));
        System.out.println("---------------------");
        offerList.addAll(Arrays.asList(moreOffers));
        System.out.println(offerList);
        System.out.println("---------------------");
        // Can you strore offers which is equal or more than 130_000 into another ArrayList

        ArrayList<Offer> salaryMoreList = new ArrayList<>(offerList);

        salaryMoreList.removeIf(eachOffer ->eachOffer.salary<130000);
        System.out.println("List of Offers with more salaraies");
        System.out.println(salaryMoreList);

        System.out.println("---------------------");
        // Can you find the Full Time offers
        ArrayList<Offer> fullTimeList =new ArrayList<>(offerList);
        fullTimeList.removeIf(each->!each.isFullTime);
        System.out.println("List of Offers with Full Time: ");
        System.out.println(fullTimeList);
    }
}
