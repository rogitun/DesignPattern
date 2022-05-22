package observer.imple.weather;

import observer.inter.weather.DisplayElement;
import observer.inter.weather.Observer;
import observer.inter.weather.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    //weatherData = 관찰 대상
    //현재 currentConditionDisplay 클래스는 관찰자(Observer)

    //weatherData의 변경 사항을 받아서 적용
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 기온 : " + temperature + " |  " +
                "현재 습도 : " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
