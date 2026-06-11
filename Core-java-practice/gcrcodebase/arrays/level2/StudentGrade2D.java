import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Columns: Physics, Chemistry, Maths
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input Marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("Physics Marks: ");
                else if (j == 1)
                    System.out.print("Chemistry Marks: ");
                else
                    System.out.print("Maths Marks: ");

                marks[i][j] = sc.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Invalid Marks! Enter Again.");
                    j--;
                }
            }
        }

        // Calculate Percentage and Grade
        for (int i = 0; i < n; i++) {

            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // Display Result
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tPercentage\tGrade");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.2f%%\t\t%c\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }
    }
}