public interface ControlManager {


    void add(ControlManager controlManager);
    default void add(){

        System.out.println("System checked.");




    }


}
