package creational.builder.after.innser_class_approach;

public class Director {
    public User createUser() {
        User user = User.getUserBuilder()
                .withAddress("India")
                .withAge(10)
                .withFirstName("Hritik")
                .withLastName("Sharma")
                .withPhoneNumber("8209062638")
                .build();
        return user;
    }
}
/*
    Director class is used to create object of user class with certain properties
    What we have solved:
        1. We don't need to crate constructors now
        2. We can set any value with withFunction
        3. If we don't want to set some values then we can avoid them as well
        4. Here
 */