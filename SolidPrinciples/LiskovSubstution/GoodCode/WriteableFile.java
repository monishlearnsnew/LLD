package SolidPrinciples.LiskovSubstution.GoodCode;

public class WriteableFile extends ReadableFile implements Writeable {
    public void  write() {
        System.out.println("writing to the file");
    }
}
