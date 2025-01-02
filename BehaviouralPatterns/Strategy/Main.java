package BehaviouralPatterns.Strategy;

public class Main {
    public static void main(String[] args){
        StrategyMain strategy = new StrategyMain();
        strategy.setStrategy(new CreditCard());
        strategy.processPayment();
        strategy.setStrategy(new DebitCard());
        strategy.processPayment();
    }
}
