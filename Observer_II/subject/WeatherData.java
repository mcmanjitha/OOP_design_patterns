package subject;
import observer.Observer;

import java.util.ArrayList;

public class WeatherData extends Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(i);
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
