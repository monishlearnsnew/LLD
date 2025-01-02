package OOPSBASICS.PaymentServiceMethods.PaymentServiceMethods;

public class Main {
    public static void main(String[] args){
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("monishcreditcard", new CreditCard("12345", "monish"));
        ps.makePayment("monishcreditcard");
    }
    
}
