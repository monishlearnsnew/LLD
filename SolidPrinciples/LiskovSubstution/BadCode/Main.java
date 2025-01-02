package SolidPrinciples.LiskovSubstution.BadCode;

public class Main {
    public static void main(String[] args){
        File file = new ReadOnlyFile();
        file.read(); // works
        file.write(); // throws error
    }
}


// this breaks LSP