import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random PCM marks
    static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10; // 10 to 99
            }
        }

        return marks;
    }

    // Method to calculate total, average and percentage
    static double[][] calculateResult(int[][] marks) {

        int n = marks.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = (double) total / 3;

            double percentage = (total * 100.0) / 300;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to calculate grades
    static String[] calculateGrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80)
                grade[i] = "A";
            else if (percentage >= 70)
                grade[i] = "B";
            else if (percentage >= 60)
                grade[i] = "C";
            else if (percentage >= 50)
                grade[i] = "D";
            else if (percentage >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        return grade;
    }

    // Display Scorecard
    static void displayScoreCard(int[][] marks,
                                 double[][] result,
                                 String[] grade) {

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f%%\t\t%s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grade[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);

        double[][] result = calculateResult(marks);

        String[] grades = calculateGrade(result);

        displayScoreCard(marks, result, grades);
    }
}