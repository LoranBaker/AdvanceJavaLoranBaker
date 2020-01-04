package three;

public class CreamDecorator extends Beverage {

    private Beverage beverage;
    
    public CreamDecorator(Beverage beverage){
        super(beverage.getIme() + "S kremom");
        this.beverage = beverage;
        
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.70;
    }
}
