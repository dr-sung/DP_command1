
import java.util.ArrayList;
import java.util.List;

/**
 *   participant: Invoker
 */
public class Waiter {
    
    private final List<Order> orderQueue;
    private final List<Order> cookingQueue; // being cooked
    
    public Waiter() {
        orderQueue = new ArrayList<>();
        cookingQueue = new ArrayList<>();
    }
    
    public void takeOrder(Order o) {
        orderQueue.add(o);
    }
    
    public void placeOrder() {
        if (orderQueue.size() > 0) {
            Order o = orderQueue.get(0);
            orderQueue.remove(0);
            cookingQueue.add(o);
            o.execute();
        }
    }
    
    public void cancelOrder(Order o) {
        if (orderQueue.remove(o)) {
            System.out.println(o + ": The order is removed from the queue");
        } else if (cookingQueue.remove(o)) {
            o.unexecute(); // restore
        } else {
            System.out.println(o + ": This order was never taken.");
        }
    }
    
}
