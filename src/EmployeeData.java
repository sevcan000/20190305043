
import java.util.LinkedList;

public class EmployeeData <T>{

    public LinkedList<T> EmployeeData = new LinkedList<>();

    public void add(T data){

        this.EmployeeData.add(data);
    }

    public LinkedList<T> takeLinkedList() {
        return this.EmployeeData;
    }


}

