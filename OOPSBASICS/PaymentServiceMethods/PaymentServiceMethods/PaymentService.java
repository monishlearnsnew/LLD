package OOPSBASICS.PaymentServiceMethods.PaymentServiceMethods;

import java.util.HashMap;

public class PaymentService {
    HashMap<String,PaymentMethod> payments;

    PaymentService() {
        payments = new HashMap<>();
    }

    public  void addPaymentMethod(String name, PaymentMethod payment_method){
        payments.put(name,payment_method);
    }

    public void makePayment(String name){
        PaymentMethod pm = payments.get(name);
        pm.makePayment();
    }
}
