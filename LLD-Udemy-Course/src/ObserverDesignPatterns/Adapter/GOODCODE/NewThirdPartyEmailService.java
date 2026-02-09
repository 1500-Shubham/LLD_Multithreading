package ObserverDesignPatterns.Adapter.GOODCODE;

public class NewThirdPartyEmailService {
    void sendEmailDifferentMethod(String to,String from,String content) {
        System.out.println("Sending Third Party to "+to);
        System.out.println("Seding Third Party from " + from);
        System.out.println("Sending Third Party data"+content);

    }
}
