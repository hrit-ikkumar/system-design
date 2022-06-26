package structural.bridge.implementors;

// Implementation abstraction
public interface LinkedList<T> {
    public void addFirst(T element);
    public T removeFirst();

    public void addLast(T element);
    public T removeLast();
}
