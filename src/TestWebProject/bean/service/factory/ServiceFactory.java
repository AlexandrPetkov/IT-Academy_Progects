package TestWebProject.bean.service.factory;

import TestWebProject.bean.service.EditNoteBookService;
import TestWebProject.bean.service.SearchNoteBookService;
import TestWebProject.bean.service.impl.EditNoteBook;
import TestWebProject.bean.service.impl.SearchNoteBook;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private EditNoteBookService editNoteBookService = new EditNoteBook();
    //private EditNoteBookService editNoteBookService = new EditNDNew();
    private SearchNoteBookService searchNoteBookService = new SearchNoteBook();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        return instance;
    }

    public EditNoteBookService getEditNoteBookService() {
        return editNoteBookService;
    }

    public SearchNoteBookService getSearchNoteBookService() {
        return searchNoteBookService;
    }
}
