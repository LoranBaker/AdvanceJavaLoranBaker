package three;

public abstract class Beverage {
    
    private String ime;
    
    public Beverage(String ime){
    this.ime = ime;
            }

    public String getIme() {
        return ime;
    }
    
    public abstract double cost();
    
}
