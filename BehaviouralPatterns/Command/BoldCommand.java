package BehaviouralPatterns.Command;

public class BoldCommand implements CommandInterface{
    private TextEditor editor;

    public BoldCommand(TextEditor editor){
        this.editor  = editor;
    }
    @Override
    public void execute() {
        editor.boldText();
    }
    
}
