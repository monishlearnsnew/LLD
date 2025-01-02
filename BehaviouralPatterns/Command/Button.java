package BehaviouralPatterns.Command;

public class Button {
    private CommandInterface command;

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void onClick(){
        command.execute();
    }
}

