package behavioral.command;

import java.util.ArrayList;
import java.util.HashMap;

public class BankWorker {
    private ArrayList<Command> commands;

    public BankWorker(){
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void performCommands(){
        for(Command command : commands){
            command.execute();
        }
    }
}
