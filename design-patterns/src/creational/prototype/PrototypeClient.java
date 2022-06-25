package creational.prototype;

public class PrototypeClient {
    public static void main(String args[]) throws CloneNotSupportedException {
        Phone phone = new Phone();
        phone.start();
        System.out.println("First Phone: " + phone);

        Phone clonedPhone = (Phone) phone.clone();
        System.out.println("Cloned phone: " + clonedPhone);
    }
}
