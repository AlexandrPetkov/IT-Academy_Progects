package TestWebProject.bean.bean;

import java.util.Date;

public class AddNoteRequest extends Request {
    private String note;
    private Date date;

    public AddNoteRequest() {}

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
