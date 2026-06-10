import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar Age and Height: ");
        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar Age and Height: ");
        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony Age and Height: ");
        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Youngest: Amar");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Tallest: Amar");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
        sc.close();
    }
}