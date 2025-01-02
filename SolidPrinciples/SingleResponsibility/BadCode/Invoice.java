package SolidPrinciples.SingleResponsibility.BadCode;

public class Invoice {

    public Invoice(double amount){
    }

    public void generateInvoice() {
        System.out.println("generating invocies");
    }

    public void saveToDatabase() {
        System.out.println("saving to database");
    }
    
}

// Here the single class is handling a lot of responsibility
