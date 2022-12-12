public class Assistant extends Academician implements ControlManager{


    @Override
    public void enter() {
        int EntryTime ;
    System.out.println("Assistants entered the school at 09:00.");

    }

    @Override
    public void Exit() {
        int Exit ;
        System.out.println("The assistants exited the school at 17:00.");

    }

    @Override
    public void EntryLesson() {
        int EntryLesson;
        System.out.println("Assistants started the class at 10:00 am.");



    }
@Override
    public void EntryLab(){
        int EntryLab;
        System.out.println("Assistants entered the laboratuvar at 14:00 ");

    }

    @Override
    public void add(ControlManager controlManager) {

    }






}
