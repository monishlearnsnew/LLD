package BehaviouralPatterns.Template;

public abstract class ParserTemplate  {
    public void parse(){
        openFile();
        parseFile();
        closeFile();
    }

    public void openFile(){
        System.out.println("opening file");
    }

    public void closeFile() {
        System.out.println("closing file");
    }

    public abstract void parseFile();
}
