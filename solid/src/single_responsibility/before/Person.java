package single_responsibility.before;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
    private String name;
    private Date dob;
    private String address;

    // Constructor to set the values of Name, Date of Birth & Address
    public Person(String name, Date dob, String address) {
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    // print person details
    public void printPersonDetails(Person p) {
        System.out.println("Name: " + p.name + ", Date of Birth: " + p.dob.toLocaleString() + ", Address: " + p.address);
    }

    // Calculate Age of person
    public int calculateAge(Person p) {
        long timeDifference = (new Date().getTime()) - (p.dob.getTime());
        Date date = new Date();
        date.setTime(timeDifference);
        return date.getYear();
    }

    // Add person to database
    public void addPersonToDB(Person p) {
        // add person to database
    }
}
