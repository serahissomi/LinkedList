import java.util.*;

public class MyStack<T> {
    private MyLinkedList<T> stackList = new MyLinkedList<>();

    public void push(T data) {
        stackList.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T data = stackList.get(listSize() - 1);
        stackList.delete(listSize() - 1);
        return data;
    }

    public boolean isEmpty() {
        return listSize() == 0;
    }

    private int listSize() {
        int size = 0;

        MyLinkedList<T>.MyIterator myIter = stackList.iterator();

        while (myIter.hasNext()) {
            myIter.next();
            size++;
        }
        return size;
    }
}