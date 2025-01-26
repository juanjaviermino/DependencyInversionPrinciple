class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con tarjeta de credito de $" + amount);
    }
}