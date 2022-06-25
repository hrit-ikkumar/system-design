package creational.abstract_factory.products.storages;

public class GoogleStorage implements Storage {
    private final String id = "GC2";
    @Override
    public String getId() {
        return id;
    }
}
