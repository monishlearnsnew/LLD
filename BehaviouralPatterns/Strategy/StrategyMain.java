package BehaviouralPatterns.Strategy;

public class StrategyMain {
    PaymentStrategy paymentStrategy;

    public void processPayment(){
        paymentStrategy.processPayment();
    }

    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


}
