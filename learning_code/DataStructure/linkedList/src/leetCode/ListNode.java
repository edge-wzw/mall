package leetCode;

import javax.xml.soap.Node;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/19 16:26
 * @Version 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


    public ListNode(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("数组不能为空");
        }

        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("LinkedList: ");
        ListNode cur = this;
        while (cur.next != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("Null");
        return res.toString();
    }
}
