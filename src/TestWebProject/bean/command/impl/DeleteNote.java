package TestWebProject.bean.command.impl;

import TestWebProject.bean.bean.DeleteNoteRequest;
import TestWebProject.bean.bean.Request;
import TestWebProject.bean.bean.Response;
import TestWebProject.bean.command.Command;
import TestWebProject.bean.service.EditNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;
import TestWebProject.bean.service.factory.ServiceFactory;

public class DeleteNote implements Command {

    @Override
    public Response execute(Request request) {
        DeleteNoteRequest deleteNoteRequest = null;
        if (request instanceof DeleteNoteRequest){
            deleteNoteRequest = (DeleteNoteRequest) request;
        }

        String note;

        note = deleteNoteRequest.getDeleteNote();

        ServiceFactory factory = ServiceFactory.getInstance();
        EditNoteBookService editService = factory.getEditNoteBookService();

        Response response = new Response();
        try {
            editService.deleteNote(note);
            response.setErrorStatus(false);
            response.setSimpleMessage("Note was deleted");
            System.out.println("1");
        } catch (ServiceException e) {
            response.setErrorStatus(true);
            response.setErrorMessage("Note wasn't deleted");
            System.out.println("2");
        }

        return response;
    }
}
