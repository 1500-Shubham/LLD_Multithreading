package OOPS;

public class DebitCard extends Card implements  PaymentMethod{
    public DebitCard(String cardNo, String cardName) {
        super(cardNo, cardName);
    }
    @Override
    public void pay() {
        System.out.println("Debit Card Payment" + this.getCardName()  + this.getCardNo());
    }
}
