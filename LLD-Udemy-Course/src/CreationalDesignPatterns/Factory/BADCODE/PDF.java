package CreationalDesignPatterns.Factory.BADCODE;

public class PDF implements  Document{

    @Override
    public void read() {
        System.out.println("PDF");
    }
}
