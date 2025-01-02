package SolidPrinciples.LiskovSubstution.BadCode;

public class ReadOnlyFile extends File {

    @Override
    public void write() {
        throw new UnsupportedOperationException();
    }
}
