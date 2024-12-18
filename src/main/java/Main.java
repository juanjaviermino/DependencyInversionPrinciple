public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod crypto = new CryptoPayment();

        PaymentProcessor ccProcessor = new PaymentProcessor(creditCard);
        PaymentProcessor paypalProcessor = new PaymentProcessor(paypal);
        PaymentProcessor cryptoProcessor = new PaymentProcessor(crypto);

        ccProcessor.makePayment(150.0);
        paypalProcessor.makePayment(75.5);
        cryptoProcessor.makePayment(200.0);
    }
}
