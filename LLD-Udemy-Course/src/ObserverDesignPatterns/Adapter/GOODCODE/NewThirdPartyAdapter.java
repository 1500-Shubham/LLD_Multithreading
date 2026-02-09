package ObserverDesignPatterns.Adapter.GOODCODE;

import ObserverDesignPatterns.Adapter.GOODCODE.NewThirdPartyEmailService;
import ObserverDesignPatterns.Adapter.GOODCODE.NotificationService;

public class NewThirdPartyAdapter implements NotificationService {
    private NewThirdPartyEmailService newThirdPartyEmailService;
    public  NewThirdPartyAdapter(NewThirdPartyEmailService newThirdPartyEmailService){
        this.newThirdPartyEmailService= newThirdPartyEmailService;
    }

    @Override
    public void send(String to, String from, String content) {
//        Client knows this send method
        this.newThirdPartyEmailService.sendEmailDifferentMethod(to,from,content);
//        Wrapped this method according to our use case
    }
}
