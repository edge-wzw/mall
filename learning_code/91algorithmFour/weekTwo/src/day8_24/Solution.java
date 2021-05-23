package day8_24;

import java.util.ArrayList;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/17 20:54
 * @Version 1.0
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //判断特殊情况
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        //迭代求出链表长度l
        ListNode iter = head;
        int l = 1;
        while (iter.next != null) {
            iter = iter.next;
            l++;
        }

        //计算实际需要位移的长度
        int add = l - k % l;
        //当add与l相等时，直接返回head即可(未发生位移)
        if (add == l) {
            return head;
        }
        //否则先闭环，再找到平移后的链表头部
        iter.next = head;
        while (add > 0) {
            iter = iter.next;
            add--;
        }
        //解开闭环
        ListNode res = iter.next;
        iter.next = null;

        return res;

    }
}
