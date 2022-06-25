package creational.abstract_factory.factories;

import creational.abstract_factory.products.clouds.Cloud;
import creational.abstract_factory.products.clouds.GCP;
import creational.abstract_factory.products.storages.GoogleStorage;
import creational.abstract_factory.products.storages.Storage;

public class GoogleCloudInfra implements CloudInfra {
    @Override
    public Cloud getCloudInstance() {
        return new GCP();
    }

    @Override
    public Storage getStorage() {
        return new GoogleStorage();
    }
}
