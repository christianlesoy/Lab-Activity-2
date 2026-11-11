public class Car extends Vehicle implements Serviceable
{
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) 
    {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() 
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) 
    {
        if (numberOfDoors > 0) 
        {
            this.numberOfDoors = numberOfDoors;
        }
    }

    @Override
    public void move() 
    {
        System.out.println("A flying car moves forward");
    }

    // Overriding the parent
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
    @Override 
    public void service()
    {
        System.out.println("Checking the cars engine, oil, tires and brakess");
    }
}
