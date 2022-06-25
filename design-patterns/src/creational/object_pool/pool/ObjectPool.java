package creational.object_pool.pool;

import creational.object_pool.product.interfaces.Poolable;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

// Object pool is here pre-created all objects
public class ObjectPool<T extends Poolable> {
    // queue to store things
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int preCache) {
        availablePool = new LinkedBlockingQueue<>();
        IntStream.range(0, preCache).forEach(
                i -> availablePool.offer(creator.get())
        );
    }

    // get method must decide what to do if pool is empty. It can create new object and return that or wait until one becomes available
    public T get() {
        try{
            return availablePool.take();
        } catch (Exception exception) {
            System.out.println("take() interrupted waiting on pooled queue");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try{
            availablePool.put(obj);
        } catch (Exception exception) {
            System.out.println("put() is interrupted waiting on pooled queue");
        }
    }
}
