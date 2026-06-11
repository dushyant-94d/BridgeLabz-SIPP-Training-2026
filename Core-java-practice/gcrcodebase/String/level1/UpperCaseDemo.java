import java.util.Scanner;

public class UpperCaseDemo {

    static String convertUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String userResult = convertUpper(text);
        String builtInResult = text.toUpperCase();

        System.out.println("User Result : " + userResult);
        System.out.println("Built-in Result : " + builtInResult);
        System.out.println(userResult.equals(builtInResult));
    }
}