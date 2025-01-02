package SolidPrinciples.DependencyInversion.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendByEmail(String msg) {
        emailService.sendEmail(msg);
    }

    public void sendBySMS(String msg) {
        smsService.sendSMS(msg);
    }
}
