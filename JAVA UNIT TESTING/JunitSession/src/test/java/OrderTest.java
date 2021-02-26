import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class OrderTest {
    Order order = new Order(29, "Laptop", 37000.00);

    @org.junit.jupiter.api.Test
    void testGetQuantity() {
        assertEquals(29, order.getQuantity());
    }

    @org.junit.jupiter.api.Test
    void testSetQuantity() {
        int quantity = 12;
        Order ord = order.setQuantity(quantity);
        assertEquals(ord.getQuantity(), quantity);
    }

    @org.junit.jupiter.api.Test
    void testGetItemName() {
        String name = order.getItemName();
        assertEquals(name.equals("Laptop"), true);
    }

    @org.junit.jupiter.api.Test
    void testSetItemName() {
        String name = "HP Laptop";
        Order ord = order.setItemName(name);
        assertEquals(ord.getItemName().equals(name), true);
    }

    @org.junit.jupiter.api.Test
    void testGetPrice() {
        assertEquals(order.getPrice(), 37000.0);
    }

    @org.junit.jupiter.api.Test
    void testSetPrice() {
        double newPrice = 40000.0;
        Order ord = order.setPrice(newPrice);
        assertEquals(ord.getPrice(), newPrice);
    }

    @org.junit.jupiter.api.Test
    void testGetPriceWithTex() {
        double expectedRes = order.getPrice() + (order.getPrice() / 20);
        order.setPriceWithTex(expectedRes);
        assertEquals(order.getPriceWithTex(), expectedRes);
    }

    @org.junit.jupiter.api.Test
    void testSetPriceWithTex() {
        //5% tax on price
        double newPrice = order.getPrice() + (order.getPrice() / 20);
        Order ord = order.setPriceWithTex(newPrice);
        assertEquals(ord.getPriceWithTex(), newPrice);
    }
}