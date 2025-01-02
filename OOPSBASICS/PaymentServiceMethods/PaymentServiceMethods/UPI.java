package OOPSBASICS.PaymentServiceMethods.PaymentServiceMethods;

public class UPI implements PaymentMethod {
    String UPIid;

    public UPI(String upiId){
        this.UPIid = upiId;
    }

    public void makePayment(){
        System.out.println("making UPI payment");
    }

}
