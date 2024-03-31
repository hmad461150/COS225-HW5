public class OrderTester {
    public static void main(String[] args) {
        OrderQueue myOrderQueue = new OrderQueue(14);

        myOrderQueue.makeOrder("greg", "today", 5);
        myOrderQueue.makeOrder("timothy", "yesterday", 5);
        myOrderQueue.makeOrder("tim", "Anno Domini 17", 8);
        
        System.out.println(myOrderQueue);
        myOrderQueue.sellStock();
        
        System.out.println(myOrderQueue);
        
        myOrderQueue.addStock(10);
        

        myOrderQueue.makeOrder("k", "2049", 3);
        myOrderQueue.makeOrder("webster", "yesterday", 3);
        myOrderQueue.makeOrder("marty", "tommorow", 5);

        myOrderQueue.sellStock();
        System.out.println(myOrderQueue);

    }
}
