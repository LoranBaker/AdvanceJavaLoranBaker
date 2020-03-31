/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class StaticDisplay implements Observer, IDisplayElement{
    
    private final List<Float> temperatures = new ArrayList<>();
    private final List<Float> humidities = new ArrayList<>();
    private final List<Float> pressures = new ArrayList<>();

    public StaticDisplay(Subject subject) {
        subject.registerObserver(this);
        
    }
    @Override
    public void update(float temperatura, float humidity, float pressure) {
        temperatures.add(temperatura);
        humidities.add(humidity);
        pressures.add(pressure);
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.printf("Average temeperature, humiditiy, pressure = %s/s%/%s%n ");
    }
  
    private float average(List<Float> elements){
        float sum = 0f;
        for(float element: elements){
            sum = sum + element;
        }
        return sum / elements.size();
    }
    private float averageStream(List<Float> elements){
        return (float) elements.stream().mapToDouble(element->element).average().orElse(0.0);
    }
}
