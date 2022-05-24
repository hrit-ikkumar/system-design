package single_responsibility.after;


import java.time.LocalDate;

public class SingleResponsibilityAfter {
    public static void main(String args[]) {
        LocalDate dob = LocalDate.of(2000, 8, 15);
        Person p = new Person("Hritik", dob, "Neem Ka Thana");

        PersonDetailsService personDetailsService = new PersonDetailsService();
        personDetailsService.printPersonDetails(p);

        CalculateAgeService calculateAgeService = new CalculateAgeService();
        int age = calculateAgeService.calculateAge(p);

        AddPersonToDB addPersonToDB = new AddPersonToDB();
        addPersonToDB.addPersonToDB(p);
    }
}

/*
    Solution for Single Responsibility:
        - Once class should have only single responsibility
        - If it has more than one responsibility
        - Divide it into multiple classes
 */