package SOLIDPrinciples.DIP_DependencyInjectionPrinciple.BADCODE;

public class SMSService {
    void SendSMS(String msg){
        System.out.println("Sending SMS" + msg);
    }
}
