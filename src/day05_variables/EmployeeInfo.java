package day05_variables;

/*
    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are they full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)

    Print all the variables
 */

public class EmployeeInfo {
    public static void main(String[]args){

        String firstName, lastName, companyName, jobTitle;

//        String firstName;
//        String lastName;
//        String companyName;
//        String jobTitle;

        int age, pto;//Paid Time Off- day of Vacation

        double salary;

        boolean isFullTime, isMarried;

        char suite, gender;


firstName = "Ayaz";
lastName = "Baghirov";
companyName = "LoopAcademy";
jobTitle = "Student";
age= 37;
pto=21;
salary=120_000.00; // 120,000.00-instead of comma we can use underscore
        isFullTime=true;
        isMarried=false;
        suite='A';
        gender='M';
        String fullDetail = "Employment Information for: "+ firstName + " " + lastName + "\n\tGender: \t\t" + gender + "\n\tJob Title: \t\t" + jobTitle;
        System.out.println(fullDetail);








    }
}
