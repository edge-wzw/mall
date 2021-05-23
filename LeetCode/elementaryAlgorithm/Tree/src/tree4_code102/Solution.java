package tree4_code102;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName Solution
 * @Description
 * 102. 二叉树的层序遍历   https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * 方法：广度优先遍历
 * @Author 15588
 * @Date 2021/5/5 20:55
 * @Version 1.0
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //生成空列表用于保存结果
        List<List<Integer>> res = new ArrayList<>();
        //判断root为空的情况
        if (root == null) {
            return res;
        }

        //生成队列用于层序遍历
        Queue<TreeNode> q = new ArrayDeque<>();
        //加根节点添加到队列中
        q.offer(root);
        while (!q.isEmpty()){
            //生成列表用于保存每层的数据
            ArrayList<Integer> level = new ArrayList<>();
            int size = q.size();
            //根据队列的长度遍历完成入队出队操作，出队的数据要保存到level列表中
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                //当结点的左右子树不为空时，将子树添加到队列中
                if (node.left != null){
                    q.offer(node.left);
                }
                if (node.right != null){
                    q.offer(node.right);
                }

            }
            //将每层的数据保存到res中
            res.add(level);

        }


        return res;
    }
}
