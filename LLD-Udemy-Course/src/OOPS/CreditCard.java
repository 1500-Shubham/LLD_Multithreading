package OOPS;

public class CreditCard extends Card implements PaymentMethod{

    public CreditCard(String cardNo, String cardName) {
        super(cardNo, cardName);
    }

    @Override
    public void pay() {
        System.out.println("Credit Card Payment" + this.getCardName()  + this.getCardNo());
    }
}
