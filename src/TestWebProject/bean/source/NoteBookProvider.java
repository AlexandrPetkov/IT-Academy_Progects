package TestWebProject.bean.source;

import TestWebProject.bean.bean.entity.NoteBook;

public class NoteBookProvider {
    private static final NoteBookProvider instance = new NoteBookProvider();

    private NoteBook noteBook = new NoteBook();

    private NoteBookProvider() {}

    public static NoteBookProvider getInstance() {
        return instance;
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }
}

class A{
    private static A instance = null;

    private A() {}

    public static A getInstance(){
        if (instance == null){
            instance = new A();
        }
        return instance;

    }


}
