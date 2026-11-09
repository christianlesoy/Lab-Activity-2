public class Truck extends Vehicle 
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
    public void moveForward() 
    {
        System.out.println("Da truck moves forward");
    }

    @Override
    public void moveBackward() 
    {
        System.out.println("Da truck-kun moves backward");
    }

    @Override
    public void moveLeft() 
    {
        System.out.println("baby truck-kun moves left");
    }

    @Override
    public void moveRight() 
    {
        System.out.println("aw naur! truck moves right");
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Wheels: " + wheels);
        System.out.println("Horn Sound: " + sound);
    }
}
