package SolidPrinciples.DependencyInversion.GoodCode;

public class EmailChannel implements NotificationChannel {

    @Override
    public void sendMessage(String msg) {
        System.out.println("sending an Email with message "+msg);
    }
}
