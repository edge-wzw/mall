package day12_146;

import java.util.HashMap;

/**
 * @ClassName LRUCache
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/21 20:37
 * @Version 1.0
 */
public class LRUCache {

    class Node {
        //链表结点类
        private int key, value;
        public Node prev, next;

        public Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    class DoubleLinkedList {

        //设置虚拟头尾结点
        private Node head, tail;
        //链表元素数
        private int size;

        public DoubleLinkedList() {
            //初始化双向链表
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        //双向链表向头部添加元素
        public void addFirst(Node node) {
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
            size ++;
        }

        // 删除链表中的 node 节点（node 一定存在）
        // 由于是双链表且给的是目标 Node 节点，时间 O(1)
        public void remove(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        };

        public Node removeLast(){
            Node last = tail.prev;
            last.prev.next = tail;
            tail.prev = last.prev;
            size--;
            return last;
        }

        public int size(){
            return size;
        }
    }

    private HashMap<Integer, Node> map;
    private DoubleLinkedList cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new DoubleLinkedList();
    }

    public int get(int key) {
        if (!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key).value;
        put(key, val);
        return val;
    }

    public void put(int key, int val) {
        // 先把新节点 x 做出来
        Node x = new Node(key, val);

        if (map.containsKey(key)) {
            // 删除旧的节点，新的插到头部
            cache.remove(map.get(key));
            cache.addFirst(x);
            // 更新 map 中对应的数据
            map.put(key, x);
        } else {
            if (capacity == cache.size()) {
                // 删除链表最后一个数据
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            // 直接添加到头部
            cache.addFirst(x);
            map.put(key, x);
        }
    }
}
