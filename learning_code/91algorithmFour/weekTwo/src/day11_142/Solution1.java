package day11_142;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/20 16:02
 * @Version 1.0
 */
public class Solution1 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode iter = head;
        while (iter != null){
            if (set.contains(iter)){
                return iter;
            }
            set.add(iter);
            iter = iter.next;
        }

        return null;
    }
}
