package weather;

public class Main {
    private final static int NUMBER_OF_TASKS = 30;
    private final static int NUMBER_OF_THREADS = 5;
    public static void main(String argc[]){
        Queue inQueue = new Queue();
        TaskGenerator tg = new TaskGenerator();
        tg.setInQueue(inQueue);
        tg.setNumberOfTasks(NUMBER_OF_TASKS);
        tg.generator();
        Queue outQueue = new Queue();
        TaskExecutor[] te = new TaskExecutor[NUMBER_OF_THREADS];
        for(int i = 0; i < NUMBER_OF_THREADS; i++){
            te[i] = new TaskExecutor();
            te[i].setInQueue(inQueue);
            te[i].setOutQueue(outQueue);
            te[i].start();
        }
        while(inQueue.size() != 0){
            Thread.yield();
        }
        Logger log = new Logger();
        log.logger(outQueue);
    }
}
