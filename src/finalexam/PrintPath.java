package finalexam;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class PrintPath {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        List<Integer> result = printPath(root, 3);
        System.out.println(result);
    }

    public static List<Integer> printPath(TreeNode root, int key) {

            List<Integer> result = new ArrayList<>();
            helper(root, key, result);
            Collections.reverse(result);
            return result;
    }

    private static boolean helper(TreeNode root, int key, List<Integer> result) {
        if (root == null) {
            return false;
        }
        if (root.val == key || helper(root.left, key, result) || helper(root.right, key, result)) {
            result.add(root.val);
            return true;
        }
        return false;
    }
}
