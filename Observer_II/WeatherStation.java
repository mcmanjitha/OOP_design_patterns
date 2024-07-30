import observer.CurrentConditionDisplay;
import subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setmeasurements(80, 65, 30.2f);
    }
}
