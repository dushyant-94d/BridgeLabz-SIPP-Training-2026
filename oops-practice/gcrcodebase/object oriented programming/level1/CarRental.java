class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Default Constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Hatchback";
        rentalDays = 1;
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        double ratePerDay = 1500;
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Anil", "SUV", 5);

        c1.display();
        System.out.println();
        c2.display();
    }
}