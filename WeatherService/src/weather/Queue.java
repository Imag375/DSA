package weather;
import java.util.LinkedList;

public class Queue {
    private LinkedList<Task> queue;
    
    public Queue(){
        this.queue = new LinkedList<Task>();
    }
    
    public synchronized Task getTask(){
        Task t = this.queue.element();
        this.queue.remove(0);
        return t;
    }
    
    public synchronized void add(Task t){
        this.queue.add(t);
    }
    
    public int size(){
        return this.queue.size();
    }
}
