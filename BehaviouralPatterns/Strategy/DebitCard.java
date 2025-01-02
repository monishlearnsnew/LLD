package BehaviouralPatterns.Strategy;

public class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("making the debit card payment");
    }
}
