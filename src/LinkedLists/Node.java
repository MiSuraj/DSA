package LinkedLists;

public class Node<T> {

    private T data;
    private Node<T> next;

    public Node() {
    }

    public Node(T data, Node<T> node) {
        this.data = data;
        this.next = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
