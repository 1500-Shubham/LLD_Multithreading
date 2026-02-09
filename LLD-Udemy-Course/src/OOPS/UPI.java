package OOPS;

public class UPI implements PaymentMethod{
    String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("UPI payment done" + this.upiId);
    }
}
