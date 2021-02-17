package Question10;

import java.util.LinkedList;
import java.util.Queue;

public class Barista {
    private int token;
    private int orderId;

    public Barista(int token, int orderId) {
        this.token = token;
        this.orderId = orderId;

    }

    // takes order form Cashier
    public void takeOrderfromCashier(Queue orderQueue) {
        System.out.println("getting next order from queue whose id is " + orderQueue.peek());

    }

    // prepares coffee and add the order token to the completeOrder Queue list
    public boolean prepareCoffee(Queue completeOrderQueue, Queue orderQueue) {
        System.out.println("preparing the coffee");
        completeOrderQueue.add(orderQueue.peek());
        System.out.println("order for " + token + " is ready");
        orderQueue.remove();
        return true;

    }

}
