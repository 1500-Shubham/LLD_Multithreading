package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.GoodCode;

public class EmailService implements NotificationChannel {

    @Override
    public void notify(String msg) {
        System.out.println("Sending Email " + msg);
    }
}
