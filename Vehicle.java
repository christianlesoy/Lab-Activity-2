public class Vehicle 
{
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() 
    {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }

    int calculateAge() 
    {
        return 2026 - year;
    }

    boolean isVintage() 
    {
        return calculateAge() > 25;
    }
}