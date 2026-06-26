interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Fitness data reset successfully.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    public void logActivity() {
        System.out.println("Activity logged: Running 5 km");
    }

    public void generateReport() {
        System.out.println("Report: Calories burned = 350");
    }

    public void sendAlert() {
        System.out.println("Alert: Daily fitness goal completed!");
    }
}

public class fitness {
    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("Java supports multiple inheritance using interfaces.");
        System.out.println("Java does not support multiple inheritance using classes.");
    }
}