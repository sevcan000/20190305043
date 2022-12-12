public class BaseUI {

    public void enter(Assistant Academician){
        Academician.enter();
    }

    public void Exit(Assistant Academician){
        Academician.Exit();
    }

    public void EntryLesson(Assistant Academician){
        Academician.EntryLesson();
    }
    public void EntryLab(Assistant Academician){ Academician.EntryLab();}


    public void enter(Lecturer Academician){
        Academician.enter();
    }


    public void Exit (Lecturer Academician){
        Academician.Exit();
    }

    public void EntryLesson(Lecturer Academician){
        Academician.EntryLesson();
    }

    public void add(Assistant controlManager) {
        controlManager.add();

    }

    public void add(Lecturer controlManager) {
        controlManager.add();

    }
}
