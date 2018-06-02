package ru.mirea.dataSourceImpl;

import java.util.Date;
import java.util.Random;

import ru.mirea.dataSourceAPI.DataSourceAPI;

public class DataSourceImpl implements DataSourceAPI {
    
    @Override
    public String generatorCity(){
        String tmp;
        tmp = String.valueOf((char)((int)(Math.random()*26) + 65));
        for(int j = 1; j < 5; j++){
            tmp += "" + String.valueOf((char)((int)(Math.random()*26) + 97));
        }
        return tmp;
    }
    
    @Override
    public Date generatorDate(){
        Random rnd;
        Date dt;
        long ms;
        rnd = new Random();
        ms = -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        dt = new Date(ms);
        return dt;
    }
}
