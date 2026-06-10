import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics Marks: ");
        double physics = sc.nextDouble();

        System.out.print("Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Maths Marks: ");
        double maths = sc.nextDouble();

        double percentage = (physics + chemistry + maths) / 3;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 90)
            System.out.println("Grade A+ : Excellent");
        else if (percentage >= 80)
            System.out.println("Grade A : Very Good");
        else if (percentage >= 70)
            System.out.println("Grade B : Good");
        else if (percentage >= 60)
            System.out.println("Grade C : Average");
        else if (percentage >= 40)
            System.out.println("Grade D : Pass");
        else
            System.out.println("Grade F : Fail");
        sc.close();
    }
}