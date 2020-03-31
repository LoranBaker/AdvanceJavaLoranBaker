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
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(5f, 60f, 1f);
        new CurrentCondtionDisplay(weatherData);
        new StaticDisplay(weatherData);
        new FullConditionDisplay(weatherData);
        weatherData.setMeasurement(5f, 60f, 1f);
    }
}
