package creational.abstract_factory.products.clouds;

import creational.abstract_factory.products.storages.Storage;

public class AWS implements Cloud{
    private Storage storage;
    @Override
    public void start() {
        System.out.println("AWS Started");
    }

    @Override
    public void stop() {
        System.out.println("AWS Stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void saveToStorage(String data) {
        System.out.println("Saved: " + data);
    }
}
