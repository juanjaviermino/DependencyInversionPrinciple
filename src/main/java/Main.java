public class Main {
    public static void main(String[] args) {
        // Crear implementaciones concretas de PaymentMethod
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();

        // Usar PaymentProcessor con diferentes métodos de pago
        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardPayment);
        creditCardProcessor.makePayment(150.0);

        PaymentProcessor payPalProcessor = new PaymentProcessor(payPalPayment);
        payPalProcessor.makePayment(200.0);

        PaymentProcessor cryptoProcessor = new PaymentProcessor(new CryptoPayment());
        cryptoProcessor.makePayment(300.0);
    }
}