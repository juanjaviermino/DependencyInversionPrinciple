import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class PaymentProcessorTest {
    @Test
    void testMakePayment() {
        PaymentMethod mockPaymentMethod = new PaymentMethod() {
            @Override
            public void processPayment(double amount) {
                System.out.println("Mock payment processed for: $" + amount);
            }
        };

        PaymentProcessor paymentProcessor = new PaymentProcessor(mockPaymentMethod);
        assertDoesNotThrow(() -> paymentProcessor.makePayment(100.0), "Making payment through PaymentProcessor should not throw exceptions.");
    }
}
