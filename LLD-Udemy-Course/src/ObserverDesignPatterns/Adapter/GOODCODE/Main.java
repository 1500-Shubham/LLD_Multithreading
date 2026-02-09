package ObserverDesignPatterns.Adapter.GOODCODE;

import ObserverDesignPatterns.Adapter.GOODCODE.EmailNoticationService;
import ObserverDesignPatterns.Adapter.GOODCODE.NewThirdPartyEmailService;
import ObserverDesignPatterns.Adapter.GOODCODE.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailNoticationService();
        email.send("shubham","rupali","Golam Gola");

//        Client need to knwo differnet methods now

//        NewThirdPartyEmailService thirdPartyEmailService = new NewThirdPartyEmailService();
//        thirdPartyEmailService.sendEmailDifferentMethod("shubham","rupali","Golam Gola");

        NotificationService thirdParty = new NewThirdPartyAdapter(new NewThirdPartyEmailService());
        thirdParty.send("shubham","rupali","Golam Gola");
//        Wrapped third party method with our legacy code
    }
}
