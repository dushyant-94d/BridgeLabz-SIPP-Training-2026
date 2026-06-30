import java.util.*;

public class SmartParking {

    ArrayList<String> vehicles = new ArrayList<>();

    void enterVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    void exitVehicle(String number) {
        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle not found.");
    }

    void searchVehicle(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle is parked.");
        else
            System.out.println("Vehicle not found.");
    }

    void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = " + vehicles.size());
    }

    public static void main(String[] args) {

        SmartParking p = new SmartParking();

        p.enterVehicle("DL01AB1234");
        p.enterVehicle("UP32CD5678");
        p.enterVehicle("HR26EF1111");

        p.searchVehicle("UP32CD5678");

        p.exitVehicle("UP32CD5678");

        p.displayVehicles();
    }
}