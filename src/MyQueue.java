import java.util.*;

public class MyQueue<T> {
    private MyLinkedList<T> queueList = new MyLinkedList<>();

    public void enqueue(T data) {
        queueList.add(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T data = queueList.get(0);
        queueList.delete(0);
        return data;
    }

    public boolean isEmpty() {
        return listSize() == 0;
    }

    private int listSize() {
        MyLinkedList<T>.MyIterator myIter = queueList.iterator();

        int size = 0;
        while (myIter.hasNext()) {
            myIter.next();
            size++;
        }
        return size;
    }
}