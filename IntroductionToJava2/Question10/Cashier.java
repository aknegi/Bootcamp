package Question10;

import java.util.Queue;

public class Cashier {
    private Barista barObj = null;

    // takes order from customer
    public void takesOrderfromCustomer(Order ord) {
        System.out.println("taken order of " + ord.orderName);
    }

    // takes cash from customer
    public int takesCash(Order ord) {
        System.out.println("cash of " + ord.orderName + " is taken");
        return 3423;
    }

    // places order to barista
    public Barista placeOrdertoBarista(Order ord, int token, Queue orderQueue) {
        orderQueue.add(token);
        barObj = new Barista(token, ord.orderId);
        return barObj;
    }

    // gives order to the customer
    public void giveToken(Queue completteOrderqueue) {
        System.out.println("sorry for the wait here is the order for token " + completteOrderqueue.peek());
    }

}
