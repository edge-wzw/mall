package linklist6_code;

import java.util.ArrayList;

/**
 * @ClassName ListNode
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/19 19:46
 * @Version 1.0
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
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
        StringBuilder res = new StringBuilder();
        res.append("LinkedList: ");
        ListNode cur = this;
        while (cur.next != null) {
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append(cur.val);
        res.append("->Null");
        return res.toString();
    }

    public String toArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode cur = this;
        while (cur.next != null) {
            arrayList.add(cur.val);
            cur = cur.next;
        }
        arrayList.add(cur.val);
        return arrayList.toString();
    }
}