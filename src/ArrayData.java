import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class ArrayData<T> {

        public ArrayList<T> ArrayData = new ArrayList<>();

        public void add(T data) {

            this.ArrayData.add(data);
        }

        public ArrayList<T> takeArrayList() {
            return this.ArrayData;
        }


    }

