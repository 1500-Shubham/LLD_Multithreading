package ObserverDesignPatterns.Adapter.BADCODE;

public class NewThirdPartyEmailService {
    void sendEmailDifferentMethod(String to,String from,String content) {
        System.out.println("Sending to "+to);
        System.out.println("Seding from " + from);
        System.out.println("Sending data"+content);

    }
}
