class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con criptos de $" + amount);
    }
}