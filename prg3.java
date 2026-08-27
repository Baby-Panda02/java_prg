class Vehicle
{
    void start()
    {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle
{
    void driveCar()
    {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle
{
    void rideBike()
    {
        System.out.println("Bike is riding");
    }
}

public class VehicleTest
{
    public static void main(String[] args)
    {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.driveCar();

        b.start();
        b.rideBike();
    }
}
