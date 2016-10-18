package TestWebProject.bean.view;

import TestWebProject.bean.bean.AddNoteRequest;
import TestWebProject.bean.bean.Request;
import TestWebProject.bean.bean.Response;
import TestWebProject.bean.controller.Controller;
import TestWebProject.bean.bean.entity.Note;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    public static void main(String[] args) {
        Controller controller = new Controller();
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            Menu.printMenu();

            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("Введите заметку: ");
                    addNewNote(scanner.nextLine(), controller);
                    break;
                case "2": showAllNotes(controller);
                    break;
                case "3":
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Чет не то вы ввели");
            }
        }
    }


    private static void addNewNote(String noteText, Controller controller){
        AddNoteRequest addNoteReq = new AddNoteRequest();
        addNoteReq.setCommandName("ADD_NEW_NOTE");
        addNoteReq.setNote(noteText);
        addNoteReq.setDate(new Date());

        Response response = controller.doAction(addNoteReq);

        if (!response.isErrorStatus()) {
            System.out.println(response.getSimpleMessage());
        } else {
            System.out.println(response.getErrorMessage());
        }
    }


    private static void showAllNotes(Controller controller){
        Request request = new Request();
        request.setCommandName("RETURN_ALL_NOTES");

        Response response = controller.doAction(request);

        if (!response.isErrorStatus()) {
            List<Note> notes = response.getNotes();

            for (Note note:
                    notes) {
                System.out.println(note.getNote() + ", " + note.getDate());
            }
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
