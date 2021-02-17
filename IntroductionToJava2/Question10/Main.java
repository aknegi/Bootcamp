package Question10;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int token;
        Queue<Integer> orderQueue = new LinkedList<Integer>();
        Queue<Integer> completeOrderQueue = new LinkedList<Integer>();

        Barista barista = null;
        Customer cust = new Customer();
        Cashier cashier = new Cashier();

        Order ord = cust.placeOrdertoCashier(); // Customer places order

        cashier.takesOrderfromCustomer(ord); // Cashier takes order
        cust.paysBill(ord); // Customer pays Bill
        token = cashier.takesCash(ord); // Cashier gives token
        cust.setToken(token); // customer gets token.
        barista = cashier.placeOrdertoBarista(ord, token, orderQueue); //Cashier places order to barista
        barista.takeOrderfromCashier(orderQueue); // Barista takes order

        // if order is ready by barista then customer give the order to the Customers.
        if (barista.prepareCoffee(completeOrderQueue, orderQueue)) {
            cashier.giveToken(completeOrderQueue);
        }


    }
}
