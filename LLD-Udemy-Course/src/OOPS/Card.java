package OOPS;

public class Card {

    String cardNo;
    String cardName;

    Card (String cardNo,String cardName){
        this.cardNo=cardNo;
        this.cardName=cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
