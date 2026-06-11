import java.util.Scanner;

public class CalendarDisplay {

    // Method to check Leap Year
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get Month Name
    static String getMonthName(int month) {

        String[] months = {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to get Number of Days
    static int getDaysInMonth(int month, int year) {

        int[] days = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year))
            return 29;

        return days[month - 1];
    }

    // Method to get first day of month
    static int getFirstDay(int month, int year) {

        int day = 1;

        int y0 = year - (14 - month) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (day + x + (31 * m0) / 12) % 7;

        return d0;
    }

    static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);

        int days = getDaysInMonth(month, year);

        int firstDay = getFirstDay(month, year);

        System.out.println("\n     " + monthName + " " + year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation before first date
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%4s", "");
        }

        // Print dates
        for (int date = 1; date <= days; date++) {

            System.out.printf("%4d", date);

            if ((date + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);
    }
}