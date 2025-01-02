package BehaviouralPatterns.Momento;

public class Main {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        CareTaker ct = new CareTaker();

        editor.write("");
        ct.saveHistory(editor);

        editor.write("hello monish");
        ct.saveHistory(editor);

        editor.write("hello varun");
        ct.saveHistory(editor);

        ct.undo(editor);
        // ct.undo(editor);
        // ct.undo(editor);
        // ct.undo(editor);

        System.out.println(editor.getContent());
    }
}
