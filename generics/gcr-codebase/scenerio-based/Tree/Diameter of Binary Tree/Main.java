public class Main {

    static int diameter = 0;

    static int longestCommunicationPath(Node root) {

        diameter = 0;

        height(root);

        return diameter;
    }

    static int height(Node node) {

        if (node == null)
            return -1;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }
}