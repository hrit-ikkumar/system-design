package creational.abstract_factory.products.storages;

public class AmazonS3Storage implements Storage {
    private final String id = "S3";
    @Override
    public String getId() {
        return id;
    }
}
