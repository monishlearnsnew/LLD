package SolidPrinciples.DependencyInversion.BadCode;

public class SMSService {
    public void sendSMS(String message){
        System.out.println("sending the SMS with message "+ message);
    }
}
