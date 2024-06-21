package day25_methods;
/*
create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

    Use the following information to convert from given dollars to the desired currency type

    1 dollar = 0.92 euro
    1 dollar = 154.37 yen
    1 dollar = 32.17 lira
    1 dollar = 1,353.43 won
    1 dollar = 83.40 rupee

    Note: Don't worry about decimal formats, focus on method

    Ex:
        Input:
            euro, 100

        Output:
            92

    Ex:
        Input:
            yen, 50

        Output:
            6051.5
 */

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println(convert("euro",100));
        System.out.println(convert("LIRA",100));
        System.out.println(convert("woN", 100));

    }
    public static double convert(String currency, double amount ){

        double result =0;
        switch (currency.toLowerCase()){
            case "euro":
                result = amount*.92;
                break;
            case "yen":
                result = amount*154.37;
                break;
            case  "lira":
                result = amount*32.17;
                break;
            case  "won":
                result = amount*1353.43;
                break;
            case "rupee":
                result = amount*83.40;
                break;
            default:
                System.out.println("There is no matching currency");
        }
        return result;
    }
}
