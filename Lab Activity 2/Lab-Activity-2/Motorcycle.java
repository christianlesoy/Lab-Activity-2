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
    public void moveForward() {
        System.out.println("The motorcycle moves forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The motorcycle moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("The motorcycle moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("The motorcycle moves right");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engine);
    }
}
