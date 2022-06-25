package creational.abstract_factory.products.clouds;

import creational.abstract_factory.products.storages.Storage;

public interface Cloud {
    public void start();
    public void stop();
    public void attachStorage(Storage storage);

    public void saveToStorage(String data);
}
