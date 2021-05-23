package linklist2_code;

/**
 * @ClassName Solution
 * @Description 利用快慢指针，快指针和慢指针之间间隔n个结点，当快指针到达链表尾部时，
 * 慢指针所指的位置刚好是要被删除的结点
 * @Author 15588
 * @Date 2021/4/19 17:02
 * @Version 1.0
 */
class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast, slow;
        fast = slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        };

        slow.next = slow.next.next;
        return dummy.next;

    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode listNode = new ListNode(arr);
        Solution2 sol = new Solution2();
        ListNode res = sol.removeNthFromEnd(listNode, 2);
        System.out.println(res.toArray());
    }
}
