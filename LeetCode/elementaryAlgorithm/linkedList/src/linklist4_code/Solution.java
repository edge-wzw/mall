package linklist4_code;

/**
 * @ClassName Solution
 * @Description 迭代法
 * @Author 15588
 * @Date 2021/4/25 21:04
 * @Version 1.0
 */
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
                head = head.next;
        }
        head.next = (l1 != null) ? l1: l2;

        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode l1 = new ListNode(arr1);
        ListNode l2 = new ListNode(arr2);
        mergeTwoLists(l1, l2);
    }

}
