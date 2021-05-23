package linklist2_code;

/**
 * @ClassName Solution
 * @Description 两次遍历，第一次得到链表长度，第二次删除对应位置结点
 * @Author 15588
 * @Date 2021/4/19 17:02
 * @Version 1.0
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        int count = getLength(head);

        ListNode prev = dummy.next;
        for (int i = 0; i < count - n - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return dummy.next;

    }

    public int getLength(ListNode head) {
        int count = 1;
        while (head.next != null) {
            count++;
            head = head.next;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode listNode = new ListNode(arr);
        Solution sol = new Solution();
        ListNode res = sol.removeNthFromEnd(listNode, 2);
        System.out.println(res.toArray());
    }
}
