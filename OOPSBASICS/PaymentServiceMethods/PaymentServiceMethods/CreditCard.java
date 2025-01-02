package OOPSBASICS.PaymentServiceMethods.PaymentServiceMethods;

public class CreditCard extends Card {
    public CreditCard(String cardNo, String name){
        super(cardNo,name);
    }

    @Override
    public void makePayment(){
        System.out.println("making payment using credit card");
    }
}
