package creational.singleton.lazy;

public class StateLazy {
    // volatile keyword will make INSTANCE variable to be synchronized
    // merge the local copy to master copy of variable
    private static volatile StateLazy INSTANCE;

    public static StateLazy getInstance() {
        if(INSTANCE == null) {
            // synchornized to make sure there is only one method call is accessing it
            synchronized (StateLazy.class) {
                // check the instance variable again to make sure it has nothing otherwise we can return the first copy
                if(INSTANCE == null) {
                    INSTANCE = new StateLazy();
                }
            }
        }
        return StateLazy.INSTANCE;
    }

    public void sayHi() {
        System.out.println("Hi there");
    }
}
