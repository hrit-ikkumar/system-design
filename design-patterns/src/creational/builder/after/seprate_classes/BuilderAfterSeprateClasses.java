package creational.builder.after.seprate_classes;

public class BuilderAfterSeprateClasses {
    public static void main(String args[]) {
        Director director = new Director();
        User user = director.createUser();
        System.out.println(user.toString());
    }
}