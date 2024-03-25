public class Node<T> {
    private T data;
    public Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    public T getData() {
        return data;
    }
}