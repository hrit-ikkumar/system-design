package open_closed.after;

public class Rectangle implements Shape {
    int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return height * width;
    }
}
