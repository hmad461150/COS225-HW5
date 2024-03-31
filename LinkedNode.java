public class LinkedNode<T> {
    private LinkedNode<T> next;
    private T value;
    
    public LinkedNode(T value, LinkedNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public LinkedNode(T value) {
        this.value = value;
        this.next = null;
    }

    public LinkedNode() {
        this.value = null;
        this.next = null;
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedNode<T> node) {
        this.next = node;
    }

    public T getValue() {
        return value;
    }
}
