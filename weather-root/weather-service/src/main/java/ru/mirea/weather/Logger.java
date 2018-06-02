package ru.mirea.weather;

public class Logger {
    Task tmp;
    Queue queue;
    public void logger(Queue queue){
        this.queue = queue;
        while(queue.size() != 0){
            this.tmp = queue.getTask();
            System.out.println(this.tmp.getCity() + ' ' + this.tmp.getDate() + ' ' + this.tmp.getWeather());
        }
    }
}