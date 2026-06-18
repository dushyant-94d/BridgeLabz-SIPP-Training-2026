import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double amount, double balance)
            throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed! Available balance: ₹" + balance);
        }
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] patients = {101, 102, 103, 104, 105};

        try {
            System.out.print("Enter total bill amount: ");
            double bill = Double.parseDouble(sc.nextLine());

            System.out.print("Enter number of items: ");
            int items = Integer.parseInt(sc.nextLine());

            double costPerItem = bill / items;
            System.out.println("Cost per item = ₹" + costPerItem);

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient ID: " + patients[index]);

            processPayment(10000, 5000);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric input.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}