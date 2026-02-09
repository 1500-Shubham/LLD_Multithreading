package ObserverDesignPatterns.Adapter.BADCODE;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new EmailNoticationService();
        email.send("shubham","rupali","Golam Gola");

//        Client need to knwo differnet methods now

        NewThirdPartyEmailService thirdPartyEmailService = new NewThirdPartyEmailService();
        thirdPartyEmailService.sendEmailDifferentMethod("shubham","rupali","Golam Gola");

    }
}
