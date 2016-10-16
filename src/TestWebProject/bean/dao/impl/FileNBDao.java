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
    public Note findNote(String text) throws DAOException {

        FileReader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(SOURCE);
            br = new BufferedReader(reader);
            String noteFromFile;

            noteFromFile = br.readLine();
            while (noteFromFile != null){

            }

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e){
            throw new DAOException(e);
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {/* logging */}
            }
        }
        return null;
    }
}
