public class MovieSeatReservation {

    static int seats[] = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position requested.");
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Seat Number: " + getSeat(2));

        System.out.println("Seat Number: " + getSeat(8));
    }
}