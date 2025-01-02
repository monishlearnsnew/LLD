package BehaviouralPatterns.Momento;

import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> history = new Stack<>();

    public void saveHistory(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor){
        if(history.size() > 1){
            history.pop();
            editor.restore(history.peek());
        }
        else{
            editor.restore(history.peek());
        }
    }
}
