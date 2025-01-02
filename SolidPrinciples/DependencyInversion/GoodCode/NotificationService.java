package SolidPrinciples.DependencyInversion.GoodCode;

public class NotificationService {
    NotificationChannel channel;

    public NotificationService(NotificationChannel channel){
        this.channel = channel;
    }

    void sendMessage(String message){
        channel.sendMessage(message);
    }
}
