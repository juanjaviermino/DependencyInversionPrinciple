class PaymentProcessor {
    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double amount) {
        System.out.println("Iniciando pago..");
        paymentMethod.processPayment(amount);
        System.out.println("Pago completado con éxito");
    }
}