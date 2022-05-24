package single_responsibility.before;

import java.time.LocalDate;

class SingleResponsibility {
    public static void main(String args[]) {
        LocalDate dob = LocalDate.of(2000, 8, 15);
        Person p = new Person("Hritik", dob, "Neem Ka Thana");
        p.printPersonDetails(p);
        int age = p.calculateAge(p);
        p.addPersonToDB(p);
    }
}