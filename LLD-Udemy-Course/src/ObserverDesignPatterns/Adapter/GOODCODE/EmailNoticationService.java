package ObserverDesignPatterns.Adapter.GOODCODE;

import ObserverDesignPatterns.Adapter.GOODCODE.NotificationService;

public class EmailNoticationService implements NotificationService {
    @Override
    public void send(String to,String from,String content) {
        System.out.println("Sending to "+to);
        System.out.println("Seding from " + from);
        System.out.println("Sending data"+content);

    }
}
