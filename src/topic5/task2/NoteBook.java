package topic5.task2;

import java.util.ArrayList;

/**
 * Created by alexandr on 06.10.16.
 */
public class NoteBook {
    ArrayList<Note> notes = new ArrayList<>();
    void addNote(Note note){
        notes.add(note);
    }

    void printAllNotes(){
        for (Note note:
             notes) {
            System.out.println(note);
        }
    }

    Note searchNote(Note note){
        for (Note n:
             notes) {
            if (n.equals(note)) return n;
        }
        return null;
    }
}
