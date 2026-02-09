package SOLIDPrinciples.SRP_SingleResponsibilityPrinciple.GoodCode;

public class Invoice {
    private double amount;
    public InvoiceRepository invoiceRepository;
    public EmailNotification emailNotification;
    public Invoice(double amount){
        this.amount = amount;
        this.invoiceRepository= new InvoiceRepository();
        this.emailNotification = new EmailNotification();
    }

    //Additional Functionality
    public void generateInvoice(){
        System.out.println("Invoice generated & printed for amount " +amount);
    }

    public void saveDb(){
        this.invoiceRepository.saveToDatabase();
    }
    public void setEmailNotification(){
        this.emailNotification.sendEmailNotification();
    }




}
