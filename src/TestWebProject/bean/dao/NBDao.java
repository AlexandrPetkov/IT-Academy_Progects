package TestWebProject.bean.dao;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.dao.exception.DAOException;

import java.util.Date;

public interface NBDao {

    void addNote (String message, Date date) throws DAOException;
    Note findNote () throws DAOException;
}
