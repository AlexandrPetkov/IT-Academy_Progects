package TestWebProject.bean.service;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.service.exception.ServiceException;

import java.util.Date;
import java.util.List;

public interface SearchNoteBookService {
    List<Note> findNoteByDate(Date date) throws ServiceException;
    List<Note> findAllNotes() throws ServiceException;
}
