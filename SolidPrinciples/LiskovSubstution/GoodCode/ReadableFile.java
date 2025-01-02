package SolidPrinciples.LiskovSubstution.GoodCode;

public class ReadableFile implements Readable {
    public void read() {
        System.out.println("reading the file");
    }
}
