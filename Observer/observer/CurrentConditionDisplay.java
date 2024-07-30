package observer;

import subject.Subject;
import subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("current conditions : temperature = "+temperature+", humidity = "+humidity);
    }
}
