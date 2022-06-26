package structural.composite;

public class CompositeClient {
    public static void main(String args[]) {
        File file = createTreeOne();
        file.ls();

        File root2 = createTreeTwo();
        root2.ls();
    }

    private static File createTreeTwo() {
        return new BinaryFile("Another file", 200);
    }

    private static File createTreeOne() {
        File file1 = new BinaryFile("File1", 1000);
        Directory directory = new Directory("dire1");
        directory.addFile(file1);

        File file2 = new BinaryFile("file2", 100);
        File file3 = new BinaryFile("file3", 1000);
        Directory directory2 = new Directory("dire2");
        directory2.addFile(file2);
        directory2.addFile(file3);
        directory2.addFile(directory);
        return directory2;
    }
}
