package weather;
import java.util.Date;
import java.util.Random;

public class TaskGenerator {
    private Queue inQueue;
    private int numberOfTasks;
    private Task t;
    
    public void setInQueue(Queue queue){
        this.inQueue = queue;
    }
    
    public  void setNumberOfTasks(int number){
        this.numberOfTasks = number;
    }
    
    public void generator(){
        String tmp;
        Random  rnd;
        Date    dt;
        long    ms;
        // Get a new random instance, seeded from the clock
        rnd = new Random();
        for(int i = 0; i < numberOfTasks; i++){
            this.t = new Task();
            tmp = String.valueOf((char)((int)(Math.random()*26) + 65));
            for(int j = 1; j < 5; j++){
                tmp += "" + String.valueOf((char)((int)(Math.random()*26) + 97));
            }
            // Get an Epoch value roughly between 1940 and 2010
            // -946771200000L = January 1, 1940
            // Add up to 70 years to it (using modulus on the next long)
            ms = -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
            // Construct a date
            dt = new Date(ms);
            this.t.setCity(tmp);
            this.t.setDate(dt);
            this.inQueue.add(t);
        }
    }
}