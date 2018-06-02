package weather;
public class TaskExecutor extends Thread{
    private Queue inQueue;
    private Queue outQueue;
    
    public void setInQueue(Queue queue){
        this.inQueue = queue;
    }
    
    public void setOutQueue(Queue queue){
        this.outQueue = queue;
    }
    
    public synchronized Task weatherGenerator(Task t){
        t.setWeather((int)(Math.random()*60) - 30);
        return t;
    }
    
    @Override
    public void run(){
        Task tmp;
        while(this.inQueue.size() != 0){
            tmp = inQueue.getTask();
            tmp = weatherGenerator(tmp);
            this.outQueue.add(tmp);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Что-то пошло не так :(");
            }
        }
    }
    
}