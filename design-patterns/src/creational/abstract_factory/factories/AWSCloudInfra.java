package creational.abstract_factory.factories;

import creational.abstract_factory.products.clouds.AWS;
import creational.abstract_factory.products.clouds.Cloud;
import creational.abstract_factory.products.storages.AmazonS3Storage;
import creational.abstract_factory.products.storages.Storage;

public class AWSCloudInfra implements CloudInfra {
    @Override
    public Cloud getCloudInstance() {
        return new AWS();
    }

    @Override
    public Storage getStorage() {
        return new AmazonS3Storage();
    }
}
