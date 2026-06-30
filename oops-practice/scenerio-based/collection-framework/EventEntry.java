import java.util.*;

public class EventEntry {

    HashSet<String> participants = new HashSet<>();

    void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Rejected.");
    }

    void display() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total Participants = " + participants.size());
    }

    public static void main(String[] args) {

        EventEntry e = new EventEntry();

        e.register("anil@gmail.com");
        e.register("rahul@gmail.com");
        e.register("anil@gmail.com");

        e.display();
    }
}