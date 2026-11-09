public class Motorcycle extends Vehicle 
{
    private String engine;

    public Motorcycle(String brand, String model, int year, String engine) 
    {
        super(brand, model, year);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engine);
    }
}
