public class Motorcycle extends Vehicle implements Serviceable
{
    private String engine;

    public Motorcycle(String brand, String model, int year, String engine) 
    {
        super(brand, model, year);
        this.engine = engine;
    }

    public String getEngine() 
    {
        return engine;
    }

    @Override
    public void move() 
    {
        System.out.println("The motorcycle starts running skrtskrt");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engine);
    }
    @Override 
    public void service()
    {
        System.out.println("Check if brakes, tires and engine are good to go");
    }
}
