package P_Command.Remotes;


import P_Command.Comands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){};

    public void setCommand (Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
