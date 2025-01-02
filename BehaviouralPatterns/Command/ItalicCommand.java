package BehaviouralPatterns.Command;

public class ItalicCommand implements CommandInterface {
    private TextEditor editor;

    public ItalicCommand(TextEditor editor){
        this.editor  = editor;
    }
    @Override
    public void execute() {
        editor.italicText();
    }
    
}
