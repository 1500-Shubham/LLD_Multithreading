package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.GoodCode;

import  SOLIDPrinciples.DIP_DependencyInjectionPrinciple.GoodCode.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationChannel email = new EmailService();
        NotificationChannel sms = new SMSService();

        NotificationService emailNotification= new NotificationService(email);
        emailNotification.notify("EMAIL SERVICE");

        NotificationService smsNotification= new NotificationService(sms);
        smsNotification.notify("10101");
    }
}
