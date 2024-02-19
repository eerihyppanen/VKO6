package main;

public class Car extends Vehicle {

    private Engine engine;




    public Car(String manufacturer, String model, int maxSpeed) {
        
        super("Auto", manufacturer, model, maxSpeed);

        this.engine = new Engine("V8", 300);
    }

    public void drive() {
        
    }
    
    
}
