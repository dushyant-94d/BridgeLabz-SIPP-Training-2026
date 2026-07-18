public class Main {

    static int height(Node node) {

        if (node == null)
            return -1;

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    static boolean isTooDeep(Node root, int threshold) {

        return height(root) > threshold;
    }
}