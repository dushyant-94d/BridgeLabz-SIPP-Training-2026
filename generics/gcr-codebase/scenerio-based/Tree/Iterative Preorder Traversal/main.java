import java.util.*;

public class Main {

    static List<Integer> iterativePreorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node current = stack.pop();

            result.add(current.val);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }

        return result;
    }
}