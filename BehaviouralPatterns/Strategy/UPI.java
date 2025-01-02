package BehaviouralPatterns.Strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("making the UPI payment");
    }
}
