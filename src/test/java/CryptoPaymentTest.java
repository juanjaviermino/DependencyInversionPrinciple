import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CryptoPaymentTest {
    @Test
    void testProcessPayment() {
        CryptoPayment cryptoPayment = new CryptoPayment();
        assertDoesNotThrow(() -> cryptoPayment.processPayment(300.0), "Processing cryptocurrency payment should not throw exceptions.");
    }
}
