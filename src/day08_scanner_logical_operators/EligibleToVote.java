package day08_scanner_logical_operators;

public class EligibleToVote
{

    /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are 18 year old or above  18

    print : $name is eligible to vote: $boolean

 */
    public static void main(String[] args){

        //Person #1

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean hasCriminal = false;
        int age = 49;

        boolean isEligible = age>=18 && isCitizen && hasCriminal;
        //                    true   &&     true    &&     false
        //                           true && false
        //                               false

        System.out.println(name + " is eligible to vote "+isEligible);
// PERSON #2
        name = "Vinni Pooh";
        isCitizen = true;
        hasCriminal =true;

        age = 59;

        isEligible = age>=18 && isCitizen && !hasCriminal;
                 //=    true && true     &&   false
                 //=         true    &&      false
                 //=                false

        System.out.println(name + " is eligible to vote "+isEligible);




    }
}
