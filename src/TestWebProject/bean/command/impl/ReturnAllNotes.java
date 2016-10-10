package TestWebProject.bean.command.impl;

import TestWebProject.bean.bean.Request;
import TestWebProject.bean.bean.Response;
import TestWebProject.bean.command.Command;
import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.service.SearchNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;
import TestWebProject.bean.service.factory.ServiceFactory;

import java.util.List;

public class ReturnAllNotes implements Command{

    @Override
    public Response execute(Request request) {

        ServiceFactory factory = ServiceFactory.getInstance();
        SearchNoteBookService searchService = factory.getSearchNoteBookService();

        List<Note> notes;
        Response response = new Response();
        try {

            notes = searchService.findAllNotes();
            response.setErrorStatus(false);
            response.setNotes(notes);

        } catch (ServiceException e) {

            response.setErrorStatus(true);
            response.setErrorMessage("error message");
        }

        return response;

    }
}
