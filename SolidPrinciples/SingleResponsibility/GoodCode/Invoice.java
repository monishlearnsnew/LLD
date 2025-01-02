package SolidPrinciples.SingleResponsibility.GoodCode;

public class Invoice {

    private double amount;
    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("generating invocies");
    }

    public double getAmount(){
        return amount;
    }
    
}

// Here the single class is handling a lot of responsibility
