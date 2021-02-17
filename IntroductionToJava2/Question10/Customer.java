package Question10;

public class Customer {
    private int token = 0;
    Order ord = null;

    // set token for the customer order
    public void setToken(int token) {
        this.token = token;
    }

    // places order to cashier
    public Order placeOrdertoCashier() {
        ord = new Order(101, "coffee");
        return ord;
    }

    // pays bill of the order
    void paysBill(Order ord) {
        System.out.println("bill of " + ord.orderName + " is paid");
    }


}
