package day9_109;

import java.util.ArrayList;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/18 20:00
 * @Version 1.0
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, null);
    }

    public TreeNode sortedListToBST(ListNode left, ListNode right) {
        //如果输入的left和right相同说明都为null，返回null即可(不考虑重复元素的情况)
        if (left == right){
            return null;
        }
        ListNode mid = getMid(left, right);        //利用快慢指针找到中间结点
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(left, mid);        //递归构造左子树
        root.right = sortedListToBST(mid.next, right);        //递归构造右子树
        return root;

    }

    public ListNode getMid(ListNode left, ListNode right){
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


}
