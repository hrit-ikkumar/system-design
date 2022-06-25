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
        awsCloud.start();
        Storage awsStorage = awsCloudInfra.getStorage();
        awsCloud.attachStorage(awsStorage);
        awsCloud.saveToStorage("Hello there");
        awsCloud.stop();

        CloudInfra gcpCloudInfra = new GoogleCloudInfra();
        Cloud gcpCloud = gcpCloudInfra.getCloudInstance();
        gcpCloud.start();
        Storage gcpStorage = gcpCloudInfra.getStorage();
        gcpCloud.attachStorage(gcpStorage);
        gcpCloud.saveToStorage("Hurrey hurrey");
        gcpCloud.stop();
    }
}
