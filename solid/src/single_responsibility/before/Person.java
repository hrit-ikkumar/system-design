package single_responsibility.before;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate dob;
    private String address;

    // Constructor to set the values of Name, Date of Birth & Address
    public Person(String name, LocalDate dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    // print person details
    public void printPersonDetails(Person p) {
        System.out.println("Name: " + p.name + ", Date of Birth: " + p.dob.toString() + ", Address: " + p.address);
    }

    // Calculate Age of person
    public int calculateAge(Person p) {
        return Period.between(p.dob, LocalDate.now()).getYears();
    }

    // Add person to database
    public void addPersonToDB(Person p) {
        // add person to database
    }
}

/*
    Issue in this class:
    - We have three responsibility for one class printPersonDetails, calculateAge & addPersonToDB
 */