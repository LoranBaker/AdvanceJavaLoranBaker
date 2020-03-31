/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.pattern;

/**
 *
 * @author PC
 */
public class FullConditionDisplay implements Observer, IDisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;

    public FullConditionDisplay(Subject subject) {
        subject.registerObserver(this);
    }
    
    

    @Override
    public void update(float temperatura, float humidity, float pressure) {
        this.temperature = temperatura;
        this.humidity=humidity;
        this.pressure=pressure;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("Current temperature: " + temperature + ", humiditiy: " + humidity + ", pressure: " + pressure);
    }

   
    
}
