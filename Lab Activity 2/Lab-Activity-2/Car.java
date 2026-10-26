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

    // Overriding the parent
    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
