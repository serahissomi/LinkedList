import java.util.*;

public class MyLinkedList<T> {
    private Node<T> head;

    public class MyIterator implements Iterator<T> {
        private Node<T> current;

        public MyIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.getData();
            current = current.nextNode;
            return data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = newNode;
        }
    }

    public T get(int index) {
        Node<T> current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.getData();
            }
            count++;
            current = current.nextNode;
        }

        throw new IndexOutOfBoundsException("Index: " + index + " is Out of Range");
    }

    public void delete(int index) {
        Node<T> current = head;
        int count = 0;

        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (index == 0) {
            head = head.nextNode;
            return;
        }

        while (current.nextNode != null) {
            if (count == index - 1) {
                current.nextNode = current.nextNode.nextNode;
                return;
            }
            count++;
            current = current.nextNode;
        }

        throw new IndexOutOfBoundsException("Index: " + index);
    }

    public MyIterator iterator() {
        return new MyIterator();
    }

}
