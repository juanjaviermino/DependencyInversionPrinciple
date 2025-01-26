import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class PayPalPaymentTest {
    @Test
    void testProcessPayment() {
        PayPalPayment payPalPayment = new PayPalPayment();
        assertDoesNotThrow(() -> payPalPayment.processPayment(200.0), "Processing PayPal payment should not throw exceptions.");
    }
}
