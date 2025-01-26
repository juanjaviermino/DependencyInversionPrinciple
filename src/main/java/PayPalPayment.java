class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con PayPal de $" + amount);
    }
}