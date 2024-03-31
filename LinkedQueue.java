public class LinkedQueue<T> {
    private LinkedNode<T> head;
    private LinkedNode<T> tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(T value) {
        LinkedNode<T> node = new LinkedNode<>(value);

        if (null == head) {
            head = node;
            tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public T dequeue() {
        if (head.getNext() == null) {
            T temp = head.getValue();
            head = null;
            return temp;
        } else {
            T temp = head.getValue();
            head = head.getNext();
            return temp;
        }
    }

    public LinkedNode<T> getHead() {
        return head;
    }


}
