package interface_segregation.before;

public class InterfaceSegregationBefore {
    public static void main(String args[]) {
        Car car = new Car();

        car.fly(); // this will throw an error
    }
}
