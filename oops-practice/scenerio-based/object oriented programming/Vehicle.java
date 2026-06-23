class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println(vehicleNumber + " | " +
                ownerName + " | " +
                vehicleType);
    }

    static void displayCars(Vehicle[] vehicles) {
        System.out.println("\nCars:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("UP01A1", "Anil", "Car"),
            new Vehicle("UP01A2", "Rahul", "Bike"),
            new Vehicle("UP01A3", "Amit", "Car"),
            new Vehicle("UP01A4", "Neha", "Bike"),
            new Vehicle("UP01A5", "Riya", "Car"),
            new Vehicle("UP01A6", "Vikas", "Bike"),
            new Vehicle("UP01A7", "Suresh", "Car"),
            new Vehicle("UP01A8", "Priya", "Bike"),
            new Vehicle("UP01A9", "Rohan", "Car"),
            new Vehicle("UP01A10", "Karan", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}