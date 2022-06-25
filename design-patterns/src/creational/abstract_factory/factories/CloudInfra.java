package creational.abstract_factory.factories;

import creational.abstract_factory.products.clouds.Cloud;
import creational.abstract_factory.products.storages.Storage;

public interface CloudInfra {
    public Cloud getCloudInstance();
    public Storage getStorage();
}
