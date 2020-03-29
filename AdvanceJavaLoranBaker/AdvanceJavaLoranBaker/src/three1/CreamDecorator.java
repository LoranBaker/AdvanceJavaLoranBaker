
package three1;

public class CreamDecorator extends Beverage{
    
    private Beverage beverage;
    public CreamDecorator(Beverage beverage) {
        super(beverage.getName() + " sa slagom");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.70;
    }

    
    
    
}
