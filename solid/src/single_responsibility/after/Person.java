package single_responsibility.after;

import java.time.LocalDate;

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

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }
}
