public class OrderQueue {
    private int size;
    private int stock;
    private LinkedQueue<CustomerOrder> q;

    public OrderQueue() {
        q = new LinkedQueue<CustomerOrder>();
        size = 0;
        stock = 0;
    }
    
    public OrderQueue(int stock) {
        q = new LinkedQueue<CustomerOrder>();
        size = 0;
        this.stock = stock;
    }

    public void makeOrder(String name, String date, int quantity) {
        q.enqueue(new CustomerOrder(name, date, quantity));
    }

    public void addStock(int amount) {
        stock += amount;
    }

    public void fulfillOrder() {
        q.getHead().getValue().shipProduct();
        --stock;

        if (q.getHead().getValue().getQuantity() == 0) q.dequeue(); 
    }

    public void sellStock() {
        while(stock > 0) fulfillOrder();
    }

    public String toString() {
        return "" + q.getHead().getValue().getQuantity();
    }
}
