package main;

public class Ship extends Vehicle{

    private Engine engine;




    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Laiva", manufacturer, model, maxSpeed);
        this.engine = new Engine("Wärtsilä Super", 1000);

    }


    public void sail() {
        
    }
   
    
}
