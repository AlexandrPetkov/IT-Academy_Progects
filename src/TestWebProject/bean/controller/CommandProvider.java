package TestWebProject.bean.controller;

import TestWebProject.bean.command.Command;
import TestWebProject.bean.command.impl.AddNewNote;
import TestWebProject.bean.command.impl.ReturnAllNotes;

import java.util.HashMap;
import java.util.Map;

class CommandProvider {
    private Map<String, Command> commands = new HashMap<String, Command>();

    CommandProvider() {
        commands.put("ADD_NEW_NOTE", new AddNewNote());
        commands.put("RETURN_ALL_NOTES", new ReturnAllNotes());
    }

    public Command getCommand(String commandName){
        Command command;
        command = commands.get(commandName);
        return command;
    }
}
