package SolidPrinciples.DependencyInversion.BadCode;

public class EmailService {
    public void sendEmail(String message){
        System.out.println("sending the email with message "+ message);
    }
}
