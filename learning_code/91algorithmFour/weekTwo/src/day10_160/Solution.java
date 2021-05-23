package day10_160;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/19 19:33
 * @Version 1.0
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null) {
            ListNode hb = headB;
            while (hb != null) {
                if (hb == headA) {
                    return hb;
                }
                hb = hb.next;

            }
            headA = headA.next;

        }
        return null;
    }
}
