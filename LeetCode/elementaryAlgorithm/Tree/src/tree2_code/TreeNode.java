package tree2_code;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/1 20:52
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

