package single_responsibility.after;

public class PersonDetailsService {

    // print person details
    public void printPersonDetails(Person p) {
        System.out.println("Name: " + p.getName() + ", Date of Birth: " + p.getDob().toString() + ", Address: " + p.getAddress());
    }
}