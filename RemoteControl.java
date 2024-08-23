// RemoteControl.java
public class RemoteControl {
    private Command[] commands;
    private Command lastCommand;

    public RemoteControl(int slots) {
        commands = new Command[slots];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
        lastCommand = commands[slot];
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}
