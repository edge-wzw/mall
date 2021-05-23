/**
 * @ClassName LinkedListQueue
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/18 18:51
 * @Version 1.0
 */
public class LinkedListQueue<E> implements Queue<E>{

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public class Node{
        private E e;
        private Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }

        public Node() {
            this(null);
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null){
            tail = new Node(e);
            head = tail;
        }else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty.");
        }

        Node delNode = head;
        head = head.next;
        delNode.next = null;
        size--;

        if (head == null){
            tail = null;
        }
        return delNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty.");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("LinkedListQueue :", size));
        res.append("front ");
        Node cur = head;
        while (cur.next != null){
            res.append(cur.e + "->");
            cur = cur.next;
        }
        res.append("Null tail");
        return res.toString();
    }


    public static void main(String[] args) {
        LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            linkedListQueue.enqueue(i);
            System.out.println(linkedListQueue);
            if (i % 3 == 2){
                linkedListQueue.dequeue();
                System.out.println(linkedListQueue);
            }
        }
    }
}
