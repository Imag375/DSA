package weather;
import java.util.Date;

public class Task {
    private String city;
    private Date date;
    private Integer weather;
    
    public String getCity(){
        return this.city;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public Integer getWeather(){
        return this.weather;
    }
    
    public String setCity(String city){
        return this.city = city;
    }
    
    public Date setDate(Date date){
        return this.date = date;
    }
    
    public Integer setWeather(Integer weather){
        return this.weather = weather;
    }
}
