package BehaviouralPatterns.Momento;

public class TextEditor {
    private String content;


    public void write(String content){
        this.content = content;
    }

    public Memento save(){
        return new Memento(content);
    }

    public void restore(Memento state){
        content = state.getContent();
    }

    public String getContent(){
        return content;
    }
}
