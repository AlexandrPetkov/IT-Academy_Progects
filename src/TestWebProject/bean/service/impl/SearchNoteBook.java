package TestWebProject.bean.service.impl;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.service.SearchNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;

import java.util.Date;
import java.util.List;

public class SearchNoteBook implements SearchNoteBookService {

    @Override
    public List<Note> findNoteByDate(Date date) throws ServiceException {
        return null;
    }

    @Override
    public List<Note> findAllNotes() throws ServiceException {

        return null;
    }
}
