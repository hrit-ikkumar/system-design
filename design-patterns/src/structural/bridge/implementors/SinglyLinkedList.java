package structural.bridge.implementors;

// Singly LInkedlist or Arraylist can be implementation for this
public class SinglyLinkedList<T> implements LinkedList<T> {
    private class Node {
        private Object data;
        private Node next;

        private Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tale;

    @Override
    public void addFirst(T element) {
        if(head == null) {
            head = tale = new Node(element, null);
        } else {
            head = new Node(element, head);
        }
        size += 1;
    }

    @Override
    public T removeFirst() {
        if(head == null) {
            return null;
        }
        T temp = (T) head.data;

        if(head.next == null) {
            head = tale = null;
        } else {
            head = head.next;
        }
        size -= 1;
        return temp;
    }

    @Override
    public void addLast(T element) {
        if(tale == null) {
            tale = head = new Node(element, null);
        } else {
            Node newNode = new Node(element, null);
            tale.next = newNode;
            tale = newNode;
        }
        size += 1;
    }

    @Override
    public T removeLast() {
        if(tale == null) {
            return null;
        }
        if(head == tale) {
            T data = (T) tale.data;
            head = tale = null;
            return data;
        }
        // we don't have back pointer so we need to iterate till that
        Node runner = head;
        while(runner != null && runner.next != tale) {
            runner = runner.next;
        }
        T data = (T) tale.data;
        runner.next = null;
        tale = runner;
        size -= 1;
        return data;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "size=" + size +
                ", head=" + head +
                ", tale=" + tale +
                '}';
    }
}
