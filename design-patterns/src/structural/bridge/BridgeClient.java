package structural.bridge;

import structural.bridge.abstraction.FifoCollection;
import structural.bridge.abstraction.Queue;
import structural.bridge.implementors.SinglyLinkedList;

public class BridgeClient {
    public static void main(String args[]) {
        // We have seprated abstraction and implementation in code
        FifoCollection<String> collection = new Queue<>(new SinglyLinkedList<>());

        collection.offer("Hello");
        collection.offer("Kumar");

        System.out.println(collection.poll());
        System.out.println(collection.poll());

        // empty now
        System.out.println(collection.poll());
    }
}
