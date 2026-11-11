
public class Main 
{
    public static void main(String[] args) 
    {
        //creates one object of each class
        Car car = new Car("Toyota", "Vios", 2026, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "XRM", 2015, "Manual");
        Truck truck = new Truck("Truck-kun", "Big one", 2022, 10);
        Printer printer = new Printer();

        //Serviceable array
        System.out.println("=== SERVICEABLE OBJECTS ===");

        Serviceable[] serviceItems = {car, motorcycle, truck, printer};

        for (Serviceable item : serviceItems) 
        {
            performService(item);
        }

        //vehicle array
        System.out.println("\n=== VEHICLE OBJECTS ===");

        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle vehicle : vehicles) 
        {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }
    }

    
    public static void performService(Serviceable item) 
    {
        item.service();
    }
}
