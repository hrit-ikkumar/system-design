package creational.builder.after.seprate_classes;

public class Director {
    public User createUser() {
        User user = User.getBuilder()
                .withAddress("India")
                .withAge(2)
                .withFirstName("Hritik")
                .withLastName("Sharma")
                .withPhoneNumber("8209062638").build();

        return user;
    }
}
/*
 Here we have splitted the whole system into parts
 */