package SolidPrinciples.DependencyInversion.GoodCode;

public class Main {
    public static void main(String[] args){
        NotificationService ns = new NotificationService(new EmailChannel());
        ns.sendMessage("great work");
        NotificationService ns1 = new NotificationService(new SMSChannel());
        ns1.sendMessage("perfect work");
    }
}
