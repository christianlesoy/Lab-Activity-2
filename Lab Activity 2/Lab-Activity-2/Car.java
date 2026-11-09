public class Car extends Vehicle 
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
    public void moveForward() 
    {
        System.out.println("A flying car moves forward");
    }

    @Override
    public void moveBackward() 
    {
        System.out.println("A tesla moves backward");
    }

    @Override
    public void moveLeft() 
    {
        System.out.println("A honda civic moves left");
    }

    @Override
    public void moveRight() 
    {
        System.out.println("A flying car moves right");
    }

    // Overriding the parent
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
