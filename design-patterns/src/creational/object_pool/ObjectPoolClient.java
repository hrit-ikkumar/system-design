package creational.object_pool;

import creational.object_pool.pool.ObjectPool;
import creational.object_pool.product.concrete_implementation.Bitmap;

import java.awt.geom.Point2D;

public class ObjectPoolClient {
    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 10);

    public static void main(String args[]) {
        Bitmap bitmap = bitmapPool.get();
        bitmap.setLocation(new Point2D() {
            @Override
            public double getX() {
                return 10;
            }

            @Override
            public double getY() {
                return 20;
            }

            @Override
            public void setLocation(double x, double y) {

            }
        });
        Bitmap bitmap2 = bitmapPool.get();
        bitmap2.setLocation(new Point2D() {
            @Override
            public double getX() {
                return 50;
            }

            @Override
            public double getY() {
                return 50;
            }

            @Override
            public void setLocation(double x, double y) {

            }
        });

        bitmap.draw();
        bitmap2.draw();
        bitmapPool.release(bitmap);
        bitmapPool.release(bitmap2);
    }
}
