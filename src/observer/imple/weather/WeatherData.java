package observer.imple.weather;

import observer.inter.weather.Observer;
import observer.inter.weather.Subject;

import java.util.ArrayList;


public class WeatherData implements Subject {

    private ArrayList<Observer> observers = new ArrayList();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(o-> o.update(temperature,humidity,pressure));
    }

    public void measurementsChanged(){
        notifyObservers(); //변경시 알림
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
