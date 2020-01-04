package three;

public class Konobar {
    public static void main(String[] args) {
    Beverage espresso = new Espresso();
    drinkBeverage(espresso);
    Beverage cocaCola = new CocaCola();
    drinkBeverage(cocaCola);
    Beverage espressoWithMilk = new MilkDecorator(new Espresso());
    drinkBeverage(espressoWithMilk);
    
    Beverage beverage = new BeverageDecorator(espresso, 1.5, "s rumom");
    drinkBeverage(beverage);
    
    Espresso espresso1 = new Espresso();
    Beverage caffeWithCream = new CreamDecorator(espresso1);
    drinkBeverage(caffeWithCream);
     
    }
    
    static void drinkBeverage(Beverage beverage){
        System.out.println("Pijem : " + beverage.getIme()+ " i to kosta: " + beverage.cost());
    }
}
