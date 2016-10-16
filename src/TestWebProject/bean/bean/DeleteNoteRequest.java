package TestWebProject.bean.bean;

public class DeleteNoteRequest extends Request {

    private String deleteNote;

    public DeleteNoteRequest() {
    }

    public String getDeleteNote() {
        return deleteNote;
    }

    public void setDeleteNote(String deleteNote) {
        this.deleteNote = deleteNote;
    }
}
