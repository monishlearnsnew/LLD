package SolidPrinciples.DependencyInversion.GoodCode;

public class SMSChannel implements NotificationChannel {


    @Override
    public void sendMessage(String msg) {
        System.out.println("sending an SMS with message "+msg);
    }
}
