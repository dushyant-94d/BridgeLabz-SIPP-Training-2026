import java.util.*;

public class AttendanceTracker {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed.");
        }
    }

    void displayAttendance() {

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject : " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Students = " + students.size());
        }
    }

    public static void main(String[] args) {

        AttendanceTracker obj = new AttendanceTracker();

        obj.markAttendance("Java", "Anil");
        obj.markAttendance("Java", "Rahul");
        obj.markAttendance("Java", "Anil");

        obj.markAttendance("Python", "Amit");
        obj.markAttendance("Python", "Rahul");

        obj.displayAttendance();
    }
}