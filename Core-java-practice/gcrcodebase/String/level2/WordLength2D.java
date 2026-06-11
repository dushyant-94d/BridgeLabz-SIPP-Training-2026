import java.util.Scanner;

public class WordLength2D {

    static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitWords(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                result[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        result[index] = word;

        return result;
    }

    static String[][] wordLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = wordLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t"
                    + Integer.parseInt(result[i][1]));
        }
    }
}