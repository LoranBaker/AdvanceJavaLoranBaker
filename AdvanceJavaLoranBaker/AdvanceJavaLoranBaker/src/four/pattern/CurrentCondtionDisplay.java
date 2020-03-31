package four.pattern;

public class CurrentCondtionDisplay implements Observer, IDisplayElement{
    
    private float temperatura;
    private float humidtiy;

    public CurrentCondtionDisplay(Subject subject) {
        subject.registerObserver(this);
        
    }
    
    
    
    @Override
    public void update(float temperatura, float humidity, float pressure) {
        this.temperatura = temperatura;
        this.humidtiy = humidity;
        dispaly();
    }

    @Override
    public void dispaly() {
        System.out.println("Current temperature: " + temperatura + "! humidity: " + humidtiy);
    }
    
}
