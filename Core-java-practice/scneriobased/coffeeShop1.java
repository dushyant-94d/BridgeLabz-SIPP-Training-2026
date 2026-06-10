package Corejava.scnerioBased;

import java.util.*;

public class coffeeShop1 {

    String coffeeType;
    int quantity;

    public double calculatedPrice(double price) {
        double bill = price * quantity;
        double gst = bill * 0.18;   // GST on total bill
        double finalBill = bill + gst;
        return finalBill;
    }

    public void generateBill(double bill) {
        System.out.println("Type of Coffee: " + coffeeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Bill Amount: " + bill);
        System.out.println("Thank you for visiting!");
    }

    public static void main(String[] args) {

        System.out.println("Choose Coffee:");
        System.out.println("1. Cappuccino - 150");
        System.out.println("2. Latte - 250");
        System.out.println("3. Black Coffee - 300");
        System.out.println("4. Coffee - 50");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        coffeeShop1 coffee = new coffeeShop1();
        coffee.quantity = quantity;

        switch (choice) {
            case 1:
                coffee.coffeeType = "Cappuccino";
                coffee.generateBill(coffee.calculatedPrice(150));
                break;

            case 2:
                coffee.coffeeType = "Latte";
                coffee.generateBill(coffee.calculatedPrice(250));
                break;

            case 3:
                coffee.coffeeType = "Black Coffee";
                coffee.generateBill(coffee.calculatedPrice(300));
                break;

            case 4:
                coffee.coffeeType = "Coffee";
                coffee.generateBill(coffee.calculatedPrice(50));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}