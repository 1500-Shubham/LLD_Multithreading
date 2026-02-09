package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.GoodCode;

public class SMSService  implements  NotificationChannel{

    @Override
    public void notify(String msg) {
        System.out.println("Sending SMS" + msg);
    }
}
