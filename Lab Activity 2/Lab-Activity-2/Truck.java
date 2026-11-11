public class Truck extends Vehicle implements Serviceable
{
    private int wheels;
    private String sound;

    public Truck(String brand, String model, int year, int wheels) 
    {
        super(brand, model, year);
        this.wheels = wheels;
        this.sound = "Toott!! Toott!!";
    }

    public int getWheels() 
    {
        return wheels;
    }

    public String getSound() 
    {
        return sound;
    }

    
    @Override
    public void move() 
    {
        System.out.println("Da truck-kun moves backward");
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Wheels: " + wheels);
        System.out.println("Horn Sound: " + sound);
    }
    @Override 
    public void service()
    {
        System.out.println("Check if the cargo tires, oil and brakes are good to go");
    }
}
