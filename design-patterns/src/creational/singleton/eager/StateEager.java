package creational.singleton.eager;

public class StateEager {
    // static keyword will make it to create object at class loading
    private static final StateEager INSTANCE = new StateEager();

    // by making constructor private nobody can inherite the class
    private StateEager() {

    }

    public static StateEager getInstance() {
        return StateEager.INSTANCE;
    }
    public void sayHello() {
        System.out.println("Hello there");
    }
}
