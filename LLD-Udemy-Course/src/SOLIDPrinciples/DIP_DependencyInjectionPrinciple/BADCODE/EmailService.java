package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.BADCODE;

public class EmailService {
    void SendEmail(String msg){
        System.out.println("Sending SMS" + msg);
    }
}
