package TestWebProject.bean.dao.impl;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.dao.NBDao;
import TestWebProject.bean.dao.exception.DAOException;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class FileNBDao implements NBDao {
    public static final String SOURCE = "resources/notes.txt";

    @Override
    public void addNote(String message, Date date) throws DAOException {

        try (FileWriter writer = new FileWriter(SOURCE, true)) {
            writer.write(message+" : "+date+"\n");

        } catch (IOException e){
            throw new DAOException(e);
        }
    }

    @Override
    public List<Note> findAllNotes() throws DAOException {
        List<Note> notes = new ArrayList<>();
        FileReader reader;
        BufferedReader br = null;
        try {
            reader = new FileReader(SOURCE);
            br = new BufferedReader(reader);
            String noteFromFile;
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

            while (br.ready()){
                noteFromFile = br.readLine();
                String note = noteFromFile.substring(0, noteFromFile.indexOf(" : "));
                Date date = dateFormat.parse(noteFromFile.substring(noteFromFile.indexOf(" : ")+3));
                notes.add(new Note(note, date));
            }

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e){
            throw new DAOException(e);
        } catch (ParseException e){
            e.printStackTrace();
        }
        finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e) {/* logging */}
            }
        }
        return notes;
    }

    @Override
    public Note findNote(String text) throws DAOException {
        return null;
    }
}
