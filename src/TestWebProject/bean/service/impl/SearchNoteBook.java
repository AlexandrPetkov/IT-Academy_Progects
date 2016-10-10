package TestWebProject.bean.service.impl;

import TestWebProject.bean.bean.entity.Note;
import TestWebProject.bean.bean.entity.NoteBook;
import TestWebProject.bean.service.SearchNoteBookService;
import TestWebProject.bean.service.exception.ServiceException;
import TestWebProject.bean.source.NoteBookProvider;

import java.util.Date;
import java.util.List;

public class SearchNoteBook implements SearchNoteBookService {

    @Override
    public List<Note> findNoteByDate(Date date) throws ServiceException {
        return null;
    }

    @Override
    public List<Note> findAllNotes() throws ServiceException {
        NoteBookProvider source = NoteBookProvider.getInstance();
        NoteBook noteBook = source.getNoteBook();
        List<Note> notes = noteBook.getNotes();

        return notes;
    }
}
