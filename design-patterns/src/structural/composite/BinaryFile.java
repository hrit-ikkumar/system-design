package structural.composite;

// Leaf node in composite pattern
public class BinaryFile extends File{
    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("not supported in leaf node");
    }

    // Provide the functionality unrelated to children management
    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Not supported: Leaf doesn't");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Not supported: Leaf doesn't");
    }
}
