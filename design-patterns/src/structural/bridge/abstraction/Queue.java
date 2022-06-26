package structural.bridge.abstraction;

import structural.bridge.implementors.LinkedList;

// one of abstract implementation for fifo
public class Queue<T> implements FifoCollection<T>{

    // composition for implementation
    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
