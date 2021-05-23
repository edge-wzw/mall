package linklist5_code;

/**
 * @ClassName Solution1
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/26 22:16
 * @Version 1.0
 */
public class Solution1 {
    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }



        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int[] arr1 = {1, 2};
        ListNode head = new ListNode(arr1);
        boolean b = Solution.isPalindrome(head);
        System.out.println(b);
    }
}
