package day10_160;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/19 19:33
 * @Version 1.0
 */
public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        while (headA != null){
            stackA.push(headA);
            headA = headA.next;
        }
        while (headB != null){
            stackB.push(headB);
            headB = headB.next;
        }
        if (stackA.peek() == stackB.peek()){
            while (stackA.peek() == stackB.peek()){
                if (stackA.size() == 1){
                    return stackA.pop();
                }else if (stackB.size() == 1){
                    return stackB.pop();
                }
                stackA.pop();
                stackB.pop();
            }
            return stackA.pop().next;
        }
        return null;
    }
}
