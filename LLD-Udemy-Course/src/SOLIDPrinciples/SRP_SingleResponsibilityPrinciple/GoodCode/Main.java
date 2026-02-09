package SOLIDPrinciples.SRP_SingleResponsibilityPrinciple.GoodCode;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(5000);
        invoice.saveDb();
        invoice.setEmailNotification();
    }
}
