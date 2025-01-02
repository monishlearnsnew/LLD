package OOPSBASICS.PaymentServiceMethods.PaymentServiceMethods;

public class DebitCard extends Card {
    public DebitCard(String cardNo, String name){
        super(cardNo,name);
    }

    @Override
    public void makePayment(){
        System.out.println("making payment using debit card");
    }
}
