/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    
    private  float temperature;
    private  float humidty;
    private  float pressure;
    
    
    private final List<Observer> observers = new ArrayList<>();

    public WeatherData(float temperature, float humidty, float pressure) {
        this.temperature =temperature;
        this.humidty = humidty;
        this.pressure = pressure;
        measurementChanged();
    }
    public void setMeasurement(float temp, float hum, float pre){
        this.temperature = temp;
        this.humidty = hum;
        this.pressure = pre;
        measurementChanged();
    }
    
    private void measurementChanged(){
        notifyObserver();
    }
    

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(temperature, humidty, pressure);
        }
    }
    
}
