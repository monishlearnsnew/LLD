package BehaviouralPatterns.Strategy;

public class CreditCard implements PaymentStrategy {

    @Override
    public void processPayment() {
        System.out.println("making the credit card payment");
    }
    
}
