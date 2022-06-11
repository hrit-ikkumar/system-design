package creational.builder.before;

public class BuilderBefore {
    public static void main(String args[]) {
        User user = new User("Hritik",
                "Sharma",
                2,
                "8209062638",
                "India");
        System.out.println(user.toString());

        // pass null for some fields which we don't want to use
        User user2 = new User("Hritik",
                "Sharma",
                2,
                null, null);
        System.out.println(user2.toString());

        // Create a constructor for some certain fields
        User user3 = new User("Hritik",
                "Sharma");

        // Create a constructor for some certain fields
        User user4 = new User("Hritik",
                "Sharma", 7);
        System.out.println(user4.toString());
    }
}
/*
    Problem with this:
        1. If we want to create the User without some properties then we need to pass the null in their place
        2. If we want to keep some properties optional then we need to create constructor
        3. Lengthy process
        4. If there are n optional properties then n! constructor will be there


     Approaches:
     1. Using constructors or null pass => length and inefficient
     2. Setter methods => makes object mutable
     3. Using Builder Design pattern => makes object immutable and easy code
 */