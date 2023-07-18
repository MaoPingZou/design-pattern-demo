package org.zmp.headfirst.weather_station.v1;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
