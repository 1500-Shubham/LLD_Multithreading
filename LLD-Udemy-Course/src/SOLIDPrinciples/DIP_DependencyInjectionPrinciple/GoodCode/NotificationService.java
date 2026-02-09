package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.GoodCode;

import SOLIDPrinciples.DIP_DependencyInjectionPrinciple.BADCODE.EmailService;
import SOLIDPrinciples.DIP_DependencyInjectionPrinciple.BADCODE.SMSService;

public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel nc){
       this.notificationChannel=nc;
    }

    void notify(String msg){
        this.notificationChannel.notify(msg);
    }
}
