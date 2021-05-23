package tree5_code;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/5 20:56
 * @Version 1.0
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
