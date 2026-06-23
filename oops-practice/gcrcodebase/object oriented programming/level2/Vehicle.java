class Vehicle {
    static double registrationFee = 2000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType,
            String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Type: " + vehicleType);
        System.out.println("Registration No: " + registrationNumber);
        System.out.println("Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Anil", "Car", "UP81AB1234");

        if (v instanceof Vehicle) {
            v.display();
        }

        updateRegistrationFee(2500);
        v.display();
    }
}