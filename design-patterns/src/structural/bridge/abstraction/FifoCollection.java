package structural.bridge.abstraction;

// abstraction for fifo
public interface FifoCollection<T> {
    public void offer(T element);
    public T poll();
}
