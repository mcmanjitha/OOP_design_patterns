package subject;
import observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(i);
        }
    }
    public void notifyObserver(){
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setmeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
