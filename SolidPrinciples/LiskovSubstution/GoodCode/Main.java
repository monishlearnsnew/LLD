package SolidPrinciples.LiskovSubstution.GoodCode;

public class Main {
    public static void main(String[] args){
        ReadableFile file1 = new ReadableFile();
        file1.read();

        WriteableFile file2= new WriteableFile();
        file2.read();
        file2.write();
    }
}
