package day11_142;

import java.util.HashMap;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/20 16:02
 * @Version 1.0
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        HashMap<ListNode, Integer> map = new HashMap<>();
        int idx = 0;
        ListNode iter = head;
        while (iter != null){
            if (map.containsKey(iter)){
                return iter;
            }
            map.put(iter, idx);
            iter = iter.next;
            idx++;

        }

        return null;
    }
}
