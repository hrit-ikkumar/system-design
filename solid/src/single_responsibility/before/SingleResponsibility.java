package single_responsibility.before;

import java.util.Date;

class SingleResponsibility {
    public static void main(String args[]) {
        Date dob = new Date();
        dob.setDate(15);
        dob.setYear(2000);
        dob.setMonth(8);
        Person p = new Person("Hritik", dob, "Neem Ka Thana");
        p.printPersonDetails(p);
        int age = p.calculateAge(p);
        p.addPersonToDB(p);
    }
}