import java.util.Scanner;

public class CharacterType {

    static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
            return "Vowel";

        if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not a Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        System.out.println("\nCharacter\tType");

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            System.out.println(ch + "\t\t" +
                    checkCharacter(ch));
        }
    }
}