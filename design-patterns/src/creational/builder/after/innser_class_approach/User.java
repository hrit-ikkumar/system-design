package creational.builder.after.innser_class_approach;

public class User {
    private String firstName;
    private String lastName;

    private int age;

    private String phoneNumber;
    private String address;

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // instance of builder class to create user
    public static UserBuilder getUserBuilder() {
        return new UserBuilder();
    }


    static class UserBuilder {
        private User user;

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
            user = new User();
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.age = this.age;
            user.phoneNumber = this.phoneNumber;
            user.address = this.address;
            // this is immutable now
            return user;
        }
    }
}
