package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.BADCODE;

public class NotificationService {
    private SMSService smsService;
    private EmailService emailService;

//    HIGH Level module dependent on LOW Level Module


    NotificationService(){
        smsService = new SMSService();
        emailService = new EmailService();
    }

    void NotifyBySMS(String msg){
        this.smsService.SendSMS(msg);
    }
    void NotigyByEmail(String sms){
        this.emailService.SendEmail(sms);
    }
}
