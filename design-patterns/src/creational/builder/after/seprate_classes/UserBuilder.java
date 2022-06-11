package creational.builder.after.seprate_classes;

public class UserBuilder {
    // Create local copy of properties of user class

    // required properties
    private String firstName;
    private String lastName;

    private int age;

    // optional properties
    private String phoneNumber;
    private String address;

    // set values with withMethod
    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    // here we will build user object
    public User build() {
        // copy the properties from builder to user object
        User user = new User(firstName, lastName, age, phoneNumber, address);
        // this is immutable now
        return user;
    }
}