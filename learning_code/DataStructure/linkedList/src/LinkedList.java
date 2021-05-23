/**
 * @ClassName LinkedList
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/17 21:09
 * @Version 1.0
 */
public class LinkedList<E> {

    /**
     * @param null:
     * @return: null
     * @author:
     * @date:
     * @description:节点类
     */
    private class Node {
        public E e;
        public Node next;

        /**
         * @param e:
         * @param next:
         * @return: null
         * @author:
         * @date:
         * @description:构造器
         */
        public Node(E e, Node next) {
            this.e = e;
            this.next = next;

        }

        /**
         * @param e:
         * @return: null
         * @author:
         * @date:
         * @description:构造器
         */
        public Node(E e) {
            this(e, null);
        }

        /**
         * @return: null
         * @author:
         * @date:
         * @description:构造器
         */
        public Node() {
            this(null, null);
        }

        /**
         * @return: java.lang.String
         * @author:
         * @date:
         * @description:输出字符串
         */
        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyHead;     //虚拟头结点
    int size;   //元素个数

    public LinkedList() {
        //为链表添加虚拟头部节点 dummyHead
        dummyHead = new Node();
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
            throw new IllegalArgumentException("Add failed. Illegal index");
        }

        Node prev = dummyHead;
        for (int i = 0; i < idx; i++) {
            prev = prev.next;
        }

//        Node node = new Node(e);
//        node.next = prev.next;
//        prev.next = prev;

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
            throw new IllegalArgumentException("Add failed. Illegal index");
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
            throw new IllegalArgumentException("Set failed. Illegal index");
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
        for (int i = 0; i < size; i++) {
            if (e.equals(cur.e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    public E remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("Set failed. Illegal index");
        }
        Node prev = dummyHead;
        for (int i = 0; i < idx; i++) {
            prev = prev.next;
        }

        Node delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;

    }

    //删除头部元素并返回被删除的元素
    public E removeFirst() {
        return remove(0);
    }

    //删除尾部元素并返回被删除的元素
    public E removeLast() {
        return remove(size - 1);

    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("LinkedList: size = %d \n", size));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(get(i));
            if (i != size - 1) {
                res.append(" -> ");
            }
        }
        res.append("]");
        return res.toString();

    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {

            if (i % 3 == 2) {
                linkedList.addFirst(i);
            } else {
                linkedList.addLast(i);
            }
            System.out.println(linkedList.toString());
        }
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
    }
}
