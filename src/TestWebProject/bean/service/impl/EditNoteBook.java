package TestWebProject.bean.service.impl;

import TestWebProject.bean.dao.DAOFactory;
import TestWebProject.bean.dao.NBDao;
import TestWebProject.bean.dao.exception.DAOException;
import TestWebProject.bean.service.EditNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;

import java.util.Date;

public class EditNoteBook implements EditNoteBookService{

    @Override
    public void addNote(String note) throws ServiceException {
        if (note == null || "".equals(note)){
            throw new ServiceException("message");
        }

        DAOFactory factory = DAOFactory.getInstance();
        NBDao dao = factory.getNbDao();
        try {
            dao.addNote(note, new Date());
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

    @Override
    public void addNote(String note, Date date) throws ServiceException {
        if (note == null || "".equals(note)){
            throw new ServiceException("message 1");
        }

        if (date == null){
            throw new ServiceException("message 2");
        }

        DAOFactory factory = DAOFactory.getInstance();
        NBDao dao = factory.getNbDao();
        try {
            dao.addNote(note, date);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
