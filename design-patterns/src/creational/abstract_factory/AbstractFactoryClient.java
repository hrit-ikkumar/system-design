package creational.abstract_factory;

import creational.abstract_factory.factories.AWSCloudInfra;
import creational.abstract_factory.factories.CloudInfra;
import creational.abstract_factory.factories.GoogleCloudInfra;
import creational.abstract_factory.products.clouds.Cloud;
import creational.abstract_factory.products.storages.Storage;

public class AbstractFactoryClient {
    public static void main(String args[]) {
        CloudInfra awsCloudInfra = new AWSCloudInfra();
        Cloud awsCloud = awsCloudInfra.getCloudInstance();
        Storage awsStorage = awsCloudInfra.getStorage();

        CloudInfra gcpCloudInfra = new GoogleCloudInfra();
        Cloud gcpCloud = gcpCloudInfra.getCloudInstance();
        Storage gcpStorage = gcpCloudInfra.getStorage();
    }
}
