import java.util.Scanner;

public class SubStringDemo {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("User Substring: " + userSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println(userSub.equals(builtInSub));
    }
}