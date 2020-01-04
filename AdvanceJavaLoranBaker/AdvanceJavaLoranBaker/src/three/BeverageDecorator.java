/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three;

/**
 *
 * @author PC
 * @param <B>
 */
public class BeverageDecorator extends Beverage{
    
    private final double cost;
    private final Beverage beverage;

    public BeverageDecorator(Beverage beverage,double cost, String name) {
        super(name);
        this.beverage = beverage;
        this.cost = cost;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }
    
    
}