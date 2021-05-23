package tree1_code;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/1 20:53
 * @Version 1.0
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        return 1 + Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
    }
}
