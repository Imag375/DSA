package ru.mirea.weather;

import ru.mirea.dataSourceAPI.DataSourceAPI;
import ru.mirea.dataSourceImpl.DataSourceImpl;

public class TaskGenerator {
    private Queue inQueue;
    private int numberOfTasks;
    private Task t;
    private DataSourceImpl datasource;
    
    public void setInQueue(Queue queue){
        this.inQueue = queue;
    }
    
    public  void setNumberOfTasks(int number){
        this.numberOfTasks = number;
    }
    
    public void generator(){
        for(int i = 0; i < numberOfTasks; i++){
            this.t = new Task();
            this.t.setCity(datasource.generatorCity());
            this.t.setDate(datasource.generatorDate());
            this.inQueue.add(t);
        }
    }
}