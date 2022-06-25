package creational.abstract_factory.products.clouds;

import creational.abstract_factory.products.storages.Storage;

public class GCP implements Cloud{
    private Storage storage;
    @Override
    public void start() {
        System.out.println("Google Cloud Platform started");
    }

    @Override
    public void stop() {
        System.out.println("Google Cloud Platform stopped");
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
