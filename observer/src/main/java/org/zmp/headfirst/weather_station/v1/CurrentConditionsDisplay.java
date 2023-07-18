package org.zmp.headfirst.weather_station.v1;

import java.time.temporal.Temporal;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    /**
     * 构造函数初始化发布者
     * 注册自己为观察者
     */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
