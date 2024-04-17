package day08_scanner_logical_operators;

public class Discount {  /*
    Task
        declare and assign
            is it the weekend
            are you a teacher
            are you a police officer
            are you a firefighter

         Do you get a discount?
            Must be a weekend day and you must be one of the given professions
 */

    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFireFighter = false;

        boolean isEligibleForDiscount= isWeekend && (isTeacher|| isOfficer || isFireFighter);
        //                                              false ||   true    ||       false
        //                                                   true   ||   false
        //                                                         True
        //                                true  && true
        //                                    true




        System.out.println(" It is eligible: "+ isEligibleForDiscount);


    }
}
