/**
 * @ClassName LinkedList
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/17 21:09
 * @Version 1.0
 */
public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;
    int size;

    public LinkedList() {
        //为链表添加虚拟头部节点 dummyHead
        this.dummyHead = new Node(null, null);
        size = 0;
    }

    //获取链表中的元素个数 getSize
    public int getSize() {
        return size;
    }

    //判断链表是否为空 isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    //在链表对应索引处插入元素 add
    public void add(int idx, E e) {
        if (idx < 0 || idx > size) {
            throw new IllegalArgumentException("索引非法");
        }

        Node prev = dummyHead;
        for (int i = 0; i < idx; i++) {
            prev = prev.next;
        }

//        Node node = new Node(e);
//        node.next = prev.next;
//        prev.next = node;

        prev.next = new Node(e, prev.next);
        size++;

    }

    //在链表头部添加元素 addFirst
    public void addFirst(E e) {
        add(0, e);
    }

    // 在链表尾部添加元素 addLast
    public void addLast(E e) {
        add(size, e);
    }


    //遍历链表，获取指定索引处的元素 get
    public E get(int idx) {

        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("索引非法");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < idx; i++) {
            cur = cur.next;
        }

        return cur.e;

    }

    //获取头部元素 getFirst
    public E getFirst() {
        return get(0);
    }

    //遍历链表，获取尾部元素 getLast
    public E getLast() {
        return get(size - 1);
    }

    // 遍历链表，修改指定索引处的元素 set
    public void set(int idx, E e) {
        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("索引非法");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < idx; i++) {
            cur = cur.next;
        }
        cur.e = e;

    }


    //查找链表中是否有元素e contains
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (e.equals(cur.e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //toString()

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("linkedList:");
//        Node cur = dummyHead.next;
//        while (cur != null) {
//            res.append(cur + "->");
//            cur = cur.next;
//        }

        for (Node cur = dummyHead.next; cur != null; cur = cur.next) {
            res.append(cur + "->");
        }

        res.append("NULL");
        return res.toString();

    }

    //删除对应索引的元素并返回被删除的元素
    public E remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("索引非法");
        }
        Node prev = dummyHead;
        for (int i = 0; i < idx; i++) {
            prev = prev.next;
        }

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;

    }

    //删除头部元素并返回被删除的元素
    public E removeFirst() {
        return remove(0);
    }

    //删除尾部元素并返回被删除的元素
    public E removeLast() {
        return remove(size);
    }

}
