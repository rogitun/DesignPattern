package observer;

import observer.imple.button.Button;
import observer.imple.weather.CurrentConditionDisplay;
import observer.imple.weather.WeatherData;
import observer.inter.button.OnClickListener;

public class ObserverMain {
    public static void main(String[] args) {
        //TODO Weather
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(25, 35, 5);

    }
}