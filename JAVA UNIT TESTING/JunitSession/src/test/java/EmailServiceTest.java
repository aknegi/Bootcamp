import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EmailServiceTest {
    private EmailService emailService;
    private Order order;

    @Test
    void shouldBeSingleInstanceOfEmailService() {
        EmailService emp1 = EmailService.getInstance();
        EmailService emp2 = EmailService.getInstance();
        assertTrue(emp1.equals(emp2));
    }

    @Test
    void sendEmail() {
        Assertions.assertThrows(RuntimeException.class, () -> emailService.sendEmail(new Order()));
    }

    @Test
    void testSendEmail() {
        String s = "order dispatched";
        assertTrue(EmailService.getInstance().sendEmail(order, s));
    }
}