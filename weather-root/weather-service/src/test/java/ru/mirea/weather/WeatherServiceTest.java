package ru.mirea.weather;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


import ru.mirea.dataSourceImpl.DataSourceImpl;

public class WeatherServiceTest {
    Queue inQueue = new Queue();
    Queue outQueue = new Queue();
    Task[] t1 = new Task[3];
    Task[] t2 = new Task[3];
    Task tmp;
    
    @Before
    public void dataSet(){
        DataSourceImpl dsi = new DataSourceImpl();
        t1[0] = new Task(); 
        t1[1] = new Task();
        t1[2] = new Task();
        t1[0].setCity(dsi.generatorCity()); t1[0].setDate(dsi.generatorDate());
        t1[1].setCity(dsi.generatorCity()); t1[1].setDate(dsi.generatorDate());
        t1[2].setCity(dsi.generatorCity()); t1[2].setDate(dsi.generatorDate());
    }
   
    @Test
    public void weatherTest1() {
        for(int i = 0; i < 3; i++){
            inQueue.add(t1[i]);
        }
        assertEquals(inQueue.size(), 3);
        for(int i = 0; i < 3; i++){
            tmp = inQueue.getTask();
        }
    }
    
    @Test
    public void weatherTest2(){
        for(int i = 0; i < 3; i++){
            inQueue.add(t1[i]);
        }
        for(int i = 0; i < 3; i++){
            tmp = inQueue.getTask();
            outQueue.add(tmp);
        }
        assertEquals(outQueue.size(), 3);
        for(int i = 0; i < 3; i++){
            tmp = outQueue.getTask();
        }
    }
    
    @Test
    public void weatherTest3(){
        for(int i = 0; i < 3; i++){
            inQueue.add(t1[i]);
        }
        for(int i = 0; i < 3; i++){
            tmp = inQueue.getTask();
        }
        assertEquals(inQueue.size(), 0);
    }
    
    @Test
    public void weatherTest4(){
        for(int i = 0; i < 3; i++){
            inQueue.add(t1[i]);
        }
        for(int i = 0; i < 3; i++){
            tmp = inQueue.getTask();
            outQueue.add(tmp);
        }
        for(int i = 0; i < 3; i++){
            t2[i] = outQueue.getTask();
            assertEquals(t2[i], t1[i]);
        }
    }
    
    @Test
    public void weatherTest5(){
        for(int i = 0; i < 3; i++){
            inQueue.add(t1[i]);
        }
        for(int i = 0; i < 3; i++){
            tmp = inQueue.getTask();
            outQueue.add(tmp);
        }
        for(int i = 0; i < 3; i++){
            t2[i] = outQueue.getTask();
        }
        assertEquals(outQueue.size(), 0);
    }
}
