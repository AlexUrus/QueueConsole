package sgups;

import java.util.HashMap;
import java.util.Map;

public class QueueStudent {

    int position;
    Map<Integer,Student> queue;
    public QueueStudent() {
        queue = new HashMap<Integer,Student>();
        position = 0;
    }

    public void addInQueue(Student student){
        position++;
        queue.put(position,student);
    }

    public void removeInQueue(Student student) throws Exception {
        if(position > 0){
            position--;
            queue.remove(student);
        }else throw new Exception("Очередь пуста");
    }
}
