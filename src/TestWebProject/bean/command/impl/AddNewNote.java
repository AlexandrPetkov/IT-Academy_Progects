package TestWebProject.bean.command.impl;

import TestWebProject.bean.bean.AddNoteRequest;
import TestWebProject.bean.bean.Request;
import TestWebProject.bean.bean.Response;
import TestWebProject.bean.command.Command;
import TestWebProject.bean.service.EditNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;
import TestWebProject.bean.service.factory.ServiceFactory;

import java.util.Date;

public class AddNewNote implements Command {

    @Override
    public Response execute(Request request) {

        AddNoteRequest addNoteRequest = null;
        if (request instanceof AddNoteRequest){
            addNoteRequest = (AddNoteRequest) request;
        }

        String note;
        Date date;

        note = addNoteRequest.getNote();
        date = addNoteRequest.getDate();

        /*EditNoteBook edit = new EditNoteBook();
        try {
            edit.addNote(note, date);
        } catch (ServiceException e){
            e.printStackTrace();
        }*/

        ServiceFactory factory = ServiceFactory.getInstance();
        EditNoteBookService editService = factory.getEditNoteBookService();

        Response response = new Response();
        try {
            editService.addNote(note, date);
            response.setErrorStatus(false);
            response.setSimpleMessage("Note was added");
        } catch (ServiceException e) {
            response.setErrorStatus(true);
            response.setErrorMessage("Note wasn't added");
        }

        return response;
    }
}
