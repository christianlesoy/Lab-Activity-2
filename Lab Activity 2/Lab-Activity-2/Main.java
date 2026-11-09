
public class Main 
{

    // This is a single method that can accept any Vehicle subclass
    public static void printDetails(Vehicle vehicle) 
    {
        vehicle.displayInfo();

        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
    }

    public static void main(String[] args) 
    {

        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Toyota", "Vios", 2026, 4);
        printDetails(vehicle);
        System.out.println();

        // The same Vehicle variable now refers to a Motorcycle
        vehicle = new Motorcycle("Honda", "XRM", 2015, "Manual");
        printDetails(vehicle);
        System.out.println();

        // The same Vehicle variable now refers to a Truck
        vehicle = new Truck("Volvo", "FH16", 2022, 10);
        printDetails(vehicle);
        System.out.println();


        System.out.println("=== 2. Method Parameter ===");

        Car car = new Car("Tesla", "Roadster", 2026, 2);
        Motorcycle motor = new Motorcycle("Yamaha", "NMAX", 2026, "Automatic");
        Truck truck = new Truck("Isuzu", "Giga", 2020, 10);

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        printDetails(truck);
        System.out.println();


        System.out.println("=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = 
        {
            new Car("Toyota", "Corolla", 2020, 4),
            new Motorcycle("Honda", "XRM", 2015, "Manual"),
            new Truck("Volvo", "FH16", 2022, 10)
        };

        for (Vehicle currentVehicle : vehicles) 
        {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}
