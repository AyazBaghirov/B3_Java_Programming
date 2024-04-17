package day07_relational_operators;

public class GiftCard {
    /*


    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40


     */

    public static void main(String[] args) {

         double giftCardBalance = 200;
         double item1 = 100;
         double item2 = 50;
        System.out.println("In my gift card, i have $"+giftCardBalance+ " balance.");
        System.out.println("Buy item 1 for $"+item1+ " with your gift card.");
//giftCardBalance =giftCardBalance-item1;
giftCardBalance-=item1; // this one is same as above. Just using SHORTHAND operator

        System.out.println("After purchasing item 1, my gift card balance is $"+ giftCardBalance);

        //giftCardBalance = giftCardBalance-item2;
        giftCardBalance -= item2; // this one is same as above. Just using SHORTHAND operator
        System.out.println("After purchasing item 2, my gift card balance is $"+ giftCardBalance);


         }

    }
