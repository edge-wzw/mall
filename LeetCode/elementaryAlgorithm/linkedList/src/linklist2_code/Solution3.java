package linklist2_code;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Description 利用栈实现
 * @Author 15588
 * @Date 2021/4/19 17:02
 * @Version 1.0
 */
class Solution3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = dummy;
        while (cur.next != null){
            stack.push(cur);
            cur = cur.next;
        }
        stack.push(cur);
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode listNode = new ListNode(arr);
        Solution3 sol = new Solution3();
        ListNode res = sol.removeNthFromEnd(listNode, 2);
        System.out.println(res.toArray());
    }
}
