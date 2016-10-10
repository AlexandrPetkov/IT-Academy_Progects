package TestWebProject.bean.controller;

import TestWebProject.bean.bean.Request;
import TestWebProject.bean.bean.Response;
import TestWebProject.bean.command.Command;
import TestWebProject.bean.command.impl.AddNewNote;
import TestWebProject.bean.command.impl.ReturnAllNotes;

//variant 1
/*public class Controller {
    Command com1 = new AddNewNote();

    public Response doAction(Request request){
        String commandName = request.getCommandName();

        Response response = null;
        Command com = null;
        switch (commandName){
            case "ADD_NEW_NOTE":
                //com = new AddNewNote();
                response = com1.execute(request);
                break;
            case "RETURN_ALL_NOTES":
                com = new ReturnAllNotes();
                response = com.execute(request);
                break;
        }

        return response;
    }
}*/

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public Response doAction(Request request) {
        String commandName = request.getCommandName();

        Command command = provider.getCommand(commandName);

        Response response = command.execute(request);

        return response;
    }
}
