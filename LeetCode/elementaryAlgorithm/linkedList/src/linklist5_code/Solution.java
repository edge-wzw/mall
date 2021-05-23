package linklist5_code;

/**
 * @ClassName Solution
 * @Description 字符串
 * @Author 15588
 * @Date 2021/4/25 21:04
 * @Version 1.0
 */
public class Solution {
    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }
        StringBuilder s1 = new StringBuilder();
        while (head != null) {
            s1.append(head.val);
            head = head.next;
        }

        String s2 = s1.toString();
        String s3 = s1.reverse().toString();

        if (s2.equals(s3)) {
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
