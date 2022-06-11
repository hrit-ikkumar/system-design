package creational.builder.after.innser_class_approach;

public class BuilderAfterInnerClassApproach {
    public static void main(String args[]) {
        Director director = new Director();
        User user = director.createUser();
        System.out.println(user.toString());
    }
}
/*
    Examples:
        1. StringBuilder, CharBuffer, ByteBuffer
 */