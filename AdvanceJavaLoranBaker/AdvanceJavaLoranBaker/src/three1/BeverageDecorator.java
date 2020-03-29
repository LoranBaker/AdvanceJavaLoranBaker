
package three1;

public class BeverageDecorator extends Beverage {
    private double cost;
    private Beverage beverage;
    
    public BeverageDecorator(Beverage beverage, double cost, String name){
        super(name);
        this.beverage = beverage;
        this.cost = cost;
    }
    public double cost(){
        return beverage.cost() + cost;
    }
}
