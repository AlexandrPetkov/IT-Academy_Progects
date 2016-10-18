package TestWebProject.bean.dao;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.dao.exception.DAOException;

import java.util.Date;
import java.util.List;

public interface NBDao {

    void addNote (String message, Date date) throws DAOException;
    List<Note> findAllNotes () throws DAOException;
    Note findNote (String text) throws DAOException;
}
