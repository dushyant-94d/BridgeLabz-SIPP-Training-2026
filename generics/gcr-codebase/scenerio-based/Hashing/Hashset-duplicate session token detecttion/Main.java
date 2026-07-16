import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean hasDuplicateToken(String[] tokens) {

        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] tokens = {"A12", "B45", "C78", "A12"};

        System.out.println(hasDuplicateToken(tokens));
    }
}