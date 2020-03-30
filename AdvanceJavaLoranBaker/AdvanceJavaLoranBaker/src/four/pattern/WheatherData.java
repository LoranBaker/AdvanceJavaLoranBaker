/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.pattern;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {
    
    private final float temperature;
    private final float humidty;
    private final float pressure;
    
    
    private final List<Observer> observers = new ArrayList<>();

    public WheatherData(float temperature, float humidty, float pressure) {
        this.temperature = temperature;
        this.humidty = humidty;
        this.pressure = pressure;
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
            
        }
    }
    
}
