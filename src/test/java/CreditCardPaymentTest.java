import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CreditCardPaymentTest {
    @Test
    void testProcessPayment() {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        assertDoesNotThrow(() -> creditCardPayment.processPayment(150.0), "Processing credit card payment should not throw exceptions.");
    }
}
