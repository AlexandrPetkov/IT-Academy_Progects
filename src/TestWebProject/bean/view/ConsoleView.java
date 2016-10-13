package TestWebProject.bean.view;

import TestWebProject.bean.bean.AddNoteRequest;
import TestWebProject.bean.bean.Response;
import TestWebProject.bean.controller.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class ConsoleView {
    public static void main(String[] args) {
        Controller controller = new Controller();
        AddNoteRequest addNoteReq = new AddNoteRequest();
        StringBuilder commands = new StringBuilder("");
        try {
            Reader reader = new FileReader("test.txt");
            while (reader.ready()){
                commands.append((char) reader.read());
            }
        } catch (FileNotFoundException e){
            System.out.println("Траблы с файлом");
        }catch (IOException e){
            System.out.println("Наконец-то увидел IOException");
        }

        String[] command = commands.toString().split("\n");

        for (int i = 0; i < command.length; i++) {
            if (command[i].contains(":"))
            addNoteReq.setCommandName(command[i].substring(0, command[i].indexOf(":")-1));
            addNoteReq.setNote(command[i].substring(command[i].indexOf(":")+1));
            addNoteReq.setDate(new Date());

            Response response = controller.doAction(addNoteReq);

            if (!response.isErrorStatus()) {
                System.out.println(response.getSimpleMessage());
            } else {
                System.out.println(response.getErrorMessage());
            }

        }


/*

        ////////////////////////
        // add new note
        addNoteReq.setCommandName("ADD_NEW_NOTE");
        addNoteReq.setNote("my first note");
        addNoteReq.setDate(new Date());

        Response response = controller.doAction(addNoteReq);

        if (!response.isErrorStatus()) {
            System.out.println(response.getSimpleMessage());
        } else {
            System.out.println(response.getErrorMessage());
        }

        ////////////////////////
        // add new note
        addNoteReq = new AddNoteRequest();
        addNoteReq.setCommandName("ADD_NEW_NOTE");
        addNoteReq.setNote("my second note");
        addNoteReq.setDate(new Date());

        response = controller.doAction(addNoteReq);

        if (!response.isErrorStatus()) {
            System.out.println(response.getSimpleMessage());
        } else System.out.println(response.getErrorMessage());

        /////////////////////////
        // show all notes
        Request request = new Request();
        request.setCommandName("RETURN_ALL_NOTES");

        response = controller.doAction(request);

        if (!response.isErrorStatus()) {
            List<Note> notes = response.getNotes();

            for (Note note:
                 notes) {
                System.out.println(note.getNote() + ", " + note.getDate());
            }
        } else {
            System.out.println(response.getErrorMessage());
        }
        */
    }

}
