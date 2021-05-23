package linklist3_code;

import javax.xml.soap.Node;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/19 19:46
 * @Version 1.0
 */
public class Solution {
    public static ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }

        if (stack.isEmpty()){
            return null;
        }

        ListNode dummy = stack.pop();
        ListNode res = dummy;


        while (!stack.isEmpty()){
            res.next = stack.pop();
            res = res.next;
        }
        res.next = null;
        return dummy;
    }



    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode listNode = head;
        for (int i = 1; i < 6; i++) {
            listNode.next = new ListNode(i, null);
            listNode = listNode.next;
        }


        System.out.println("head:" + head.next);
        ListNode res = reverseList(head.next);
        System.out.println("res:" + res);


    }
}
