package TestWebProject.bean.dao.impl;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.dao.NBDao;
import TestWebProject.bean.dao.exception.DAOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class FileNBDao implements NBDao {
    public static final String SOURCE = "resource/notes.txt";

    @Override
    public void addNote(String message, Date date) throws DAOException {

    }

    @Override
    public Note findNote() throws DAOException {


        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(SOURCE));

            String noteFromFile;

            noteFromFile = reader.readLine();
            while (noteFromFile != null){

            }

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e){
            throw new DAOException(e);
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {/* logging */}
            }
        }
        return null;
    }
}
