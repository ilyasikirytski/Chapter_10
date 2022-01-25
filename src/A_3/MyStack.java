package A_3;

import java.util.Vector;

public class MyStack<E> extends Vector<E> {
    private Node<E> head;

    public void insert(E value) {
        if (head == null) {
            Node<E> firstNode = new Node<>(value);
            head = firstNode;
            firstNode.next = head;
            head = new Node<>(value);
        }
        Node<E> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<>(value);
        addElement(value);
    }

    public int getLength() {
        int length = 0;
        Node<E> walkPointer = head;
        while (walkPointer.next != null) {
            walkPointer = walkPointer.next;
            length++;
        }
        return length;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
