import java.util.Arrays;

public class SportsMeet {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }

            if (i == 0 && !swapped) {
                System.out.println("Best Case: Array Already Sorted");
            }

            if (!swapped)
                break;
        }

        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
        System.out.println("Total Swaps = " + swaps);
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Insertion Sorted: " + Arrays.toString(arr));
    }

    public static void top3(int[] arr) {
        System.out.println("Gold   : " + arr[arr.length - 1]);
        System.out.println("Silver : " + arr[arr.length - 2]);
        System.out.println("Bronze : " + arr[arr.length - 3]);
    }

    public static void main(String[] args) {

        int[] scores = {65, 82, 91, 74, 55, 88, 99, 70};

        int[] bubble = scores.clone();
        int[] insertion = scores.clone();

        bubbleSort(bubble);
        insertionSort(insertion);

        top3(bubble);
    }
}