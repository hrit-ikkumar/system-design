package creational.object_pool.product.concrete_implementation;

import creational.object_pool.product.interfaces.Image;

import java.awt.geom.Point2D;

public class Bitmap implements Image {
    private Point2D location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(location.getX() + ", " + location.getY());
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset now");
    }
}
