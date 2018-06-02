package weather;
public class Test {
    public static void test1(Task t1, Task t2){
        if(t1 == t2)
            System.out.println("Test1: Ok");
        else
            System.out.println("Test1: Failed");
    }
    public static void test2(Queue queue, int i){
        if(queue.size() == i)
            System.out.println("Test1: Ok");
        else
            System.out.println("Test1: Failed");
    }
    public static void main(String[] args) {
        Task[] t1 = new Task[3];
        Task[] t2 = new Task[3];
        Task tmp;
        Queue inQueue = new Queue();
        Queue outQueue = new Queue();
        t1[0].setCity("City1");
        t1[1].setCity("City2");
        t1[2].setCity("City3");
        for(int i = 0; i < 3; i++){
            inQueue.add(t1[i]);
        }
        test2(inQueue, 3);
        for(int i = 0; i < 3; i++){
            tmp = inQueue.getTask();
            outQueue.add(tmp);
        }
        test2(outQueue, 3);
        test2(inQueue, 0);
        for(int i = 0; i < 3; i++){
            t2[i] = outQueue.getTask();
            test1(t2[i], t1[i]);
        }
        test2(outQueue, 0);
    }
}
