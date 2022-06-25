package creational.singleton;

import creational.singleton.eager.StateEager;
import creational.singleton.lazy.StateLazy;

public class SingletonClient {
    public static void main(String args[]) {
        // The instance is created at the time of class loading
        // we can use the same instance anywhere in our code
        StateEager stateEager = StateEager.getInstance();
        stateEager.sayHello();

        // Instance will be created when it is asked for
        StateLazy stateLazy = StateLazy.getInstance();
        stateLazy.sayHi();
    }
}
