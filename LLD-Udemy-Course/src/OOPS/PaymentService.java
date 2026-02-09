package OOPS;

import java.util.HashMap;

public class PaymentService {

    HashMap<String,PaymentMethod> payments;

    public PaymentService() {
        this.payments =  new HashMap<>();
    }

    void addPayment(String key, PaymentMethod pm){
        this.payments.put(key,pm);
        System.out.println("Payment method added" + key);
    }

    void makePayment(String key){
        System.out.println("Making payment with payment method" + key);
        PaymentMethod temp = this.payments.get(key);
        temp.pay();
    }

}
