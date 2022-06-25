package creational.object_pool.product.interfaces;

import java.awt.geom.Point2D;

public interface Image extends Poolable{
    public void draw();
    public Point2D getLocation();
    public void setLocation(Point2D location);
}
