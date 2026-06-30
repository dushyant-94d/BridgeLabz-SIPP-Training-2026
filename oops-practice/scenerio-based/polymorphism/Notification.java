class Vehicle {
    protected String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double fuelCost(double km) {
        return 0;
    }

    public void display() {
        System.out.println("Vehicle: " + vehicleName);
    }
}

class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 20;
    }
}

class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}

// New class added without modifying existing classes
class ElectricCar extends Vehicle {

    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Swift"),
                new Bus("Volvo"),
                new Bike("Pulsar"),
                new ElectricCar("Tesla")
        };

        double distance = 100;

        for (Vehicle v : fleet) {

            v.display();
            System.out.println("Fuel Cost = ₹" + v.fuelCost(distance));

            if (v instanceof Car)
                System.out.println("This is a Car");

            else if (v instanceof Bus)
                System.out.println("This is a Bus");

            else if (v instanceof Bike)
                System.out.println("This is a Bike");

            else if (v instanceof ElectricCar)
                System.out.println("This is an Electric Car");

            System.out.println();
        }
    }
}