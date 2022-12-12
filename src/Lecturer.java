public class Lecturer extends  Academician implements ControlManager{


    @Override
    public void enter() {
        int EntryTime ;
        System.out.println("Lecturers entered the school at 10:00 a.m.");
    }

    @Override
    public void Exit() {
        int ExitTime ;
        System.out.println("Lecturers exited the school at 16:00.");

    }

    @Override
    public void EntryLesson() {
        int EntryLesson ;
        System.out.println("Lecturers started the lessons at 11.00 a.m.");

    }

    @Override
    public void EntryLab() {

    }


    @Override
    public void add(ControlManager controlManager) {

    }


}
