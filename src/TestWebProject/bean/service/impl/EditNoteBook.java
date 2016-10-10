package TestWebProject.bean.service.impl;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.bean.entity.NoteBook;
import TestWebProject.bean.service.EditNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;
import TestWebProject.bean.source.NoteBookProvider;

import java.util.Date;

public class EditNoteBook implements EditNoteBookService{

    @Override
    public void addNote(String note) throws ServiceException {
        if (note == null || "".equals(note)){
            throw new ServiceException("message");
        }

        add(note, new Date());

    }

    @Override
    public void addNote(String note, Date date) throws ServiceException {
        if (note == null || "".equals(note)){
            throw new ServiceException("message 1");
        }

        if (date == null){
            throw new ServiceException("message 2");
        }

        add2(note, date);
    }

    private void add(String note, Date d){
        Note newNote = new Note();
        newNote.setNote(note);
        newNote.setDate(d);

        NoteBookProvider source = NoteBookProvider.getInstance();
        NoteBook noteBook = source.getNoteBook();
        noteBook.addNote(newNote);
    }

    private void add2(String note, Date d){
        Note newNote = new Note();
        newNote.setNote(note);
        newNote.setDate(d);

        NoteBookProvider source = NoteBookProvider.getInstance();
        NoteBook noteBook = source.getNoteBook();
        noteBook.addNote(newNote);
    }
}
