package TestWebProject.bean.service;

import TestWebProject.bean.service.exception.ServiceException;

import java.util.Date;

public interface EditNoteBookService {

    void addNote(String note) throws ServiceException;
    void addNote(String note, Date date) throws ServiceException;
}
