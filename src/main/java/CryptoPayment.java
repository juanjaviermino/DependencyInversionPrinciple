class CryptoPayment implements PaymentMethod {
    
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment of $" + amount);
    }
}
