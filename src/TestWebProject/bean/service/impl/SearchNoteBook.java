package TestWebProject.bean.service.impl;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.dao.DAOFactory;
import TestWebProject.bean.dao.NBDao;
import TestWebProject.bean.dao.exception.DAOException;
import TestWebProject.bean.service.SearchNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;

import java.io.FileReader;
import java.util.Date;
import java.util.List;

public class SearchNoteBook implements SearchNoteBookService {

    @Override
    public List<Note> findNoteByDate(Date date) throws ServiceException {
        return null;
    }

    @Override
    public List<Note> findAllNotes() throws ServiceException {
        DAOFactory factory = DAOFactory.getInstance();
        NBDao dao = factory.getNbDao();
        try {
            return dao.findAllNotes();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }
}
