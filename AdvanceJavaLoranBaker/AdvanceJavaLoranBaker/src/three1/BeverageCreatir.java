package three1;

public class BeverageCreatir {
    public static void main(String[] args) {
        BosnianCaffe bosanskaKafa = new BosnianCaffe();
        drinkBeverage(bosanskaKafa);
        Beverage espresso = new Espresso();
        drinkBeverage(espresso);
        Beverage beverage = new MilkDecorator(new BosnianCaffe());
        drinkBeverage(beverage);
        
        BeverageDecorator beverage1 = new BeverageDecorator(new Espresso(), 0.4, "sa rumom");
        drinkBeverage(beverage1);
        
        Beverage caffewithCream = new CreamDecorator(new Espresso());
        drinkBeverage(caffewithCream);
         
    }
    
    static void drinkBeverage(Beverage beverage){
        System.out.println("Pijem: " + beverage.getName() + "i to me kosta : " + beverage.cost());
        
    }
}
