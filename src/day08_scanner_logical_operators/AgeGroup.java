package day08_scanner_logical_operators;

public class AgeGroup {

    /*
task:

    declare and assign an age variable

    is the person a kid ( up to 13, include 13)

    is the person a senior citizen ( 65 and above)

 */
    public static void main(String[] args) {
int personAge =13;

boolean isKid= personAge <=13;
boolean isSenior = personAge >=65;

        System.out.println("The person is kid: " + isKid);
        System.out.println("The person is senior: " + isSenior);

        personAge =70;
        isKid= personAge <=13;
        isSenior = personAge >=65;

        System.out.println("The person is kid: " + isKid);
        System.out.println("The person is senior: " + isSenior);

        personAge =40;
        isKid= personAge <=13;
        isSenior = personAge >=65;

        System.out.println("The person is kid: " + isKid);
        System.out.println("The person is senior: " + isSenior);




    }
}
