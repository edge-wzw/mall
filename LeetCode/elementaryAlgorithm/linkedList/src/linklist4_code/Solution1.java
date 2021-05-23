package linklist4_code;

/**
 * @ClassName Solution1
 * @Description 递归
 * @Author 15588
 * @Date 2021/4/25 21:53
 * @Version 1.0
 */
public class Solution1 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l2 == null ? l1 : l2;
        }
        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode l1 = new ListNode(arr1);
        ListNode l2 = new ListNode(arr2);
        ListNode listNode = mergeTwoLists(l1, l2);
        System.out.println(listNode);
    }
}
