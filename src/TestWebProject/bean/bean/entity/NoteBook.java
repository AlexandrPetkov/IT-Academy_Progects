package TestWebProject.bean.bean.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {


    private String owner;
    private List<Note> notes;

    public NoteBook() {
        notes = new ArrayList<Note>();
    }

    public void addNote(Note note){
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
