import java.util.Arrays;

public class BubbleSortMarks {

    public static void bubbleSort(int[] marks) {

        for (int i = 0; i < marks.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < marks.length - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 67, 56};

        bubbleSort(marks);

        System.out.println(Arrays.toString(marks));
    }
}