import java.util.Arrays;

/**
 * @ClassName LoopQueue
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/17 11:10
 * @Version 1.0
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    /**
     * @param capacity:
     * @return: null
     * @author:
     * @date:
     * @description:带参构造器
     */
    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        size = 0;
        front = 0;
        tail = 0;
    }

    /**
     * @return: null
     * @author:
     * @date:
     * @description:无参构造器
     */
    public LoopQueue() {
        this(10);
    }

    /**
     * @return: int
     * @author:
     * @date:
     * @description:获取队列容量
     */
    public int getCapacity() {
        return data.length - 1;
    }


    /**
     * @return: int
     * @author:
     * @date:
     * @description:获取队列元素数量
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * @return: boolean
     * @author:
     * @date:
     * @description:判断是否为空
     */
    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * @param e:
     * @return: void
     * @author:
     * @date:
     * @description:入队
     */
    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
//            throw new IllegalArgumentException("Enqueue is failed. Queue is full.");
            resize(data.length * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;

    }

    /**
     * @param newCapacity:
     * @return: void
     * @author:
     * @date:
     * @description:扩容
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }

    /**
     * @return: E
     * @author:
     * @date:
     * @description:出队
     */
    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty.");
        }
        E delElement = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;

        if (size < data.length / 4 && data.length / 2 != 0){
            resize(data.length / 2);
        }
        return delElement;
    }

    /**
     * @return: E
     * @author:
     * @date:
     * @description:查看队首元素
     */
    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Queue is empty.");
        }
        return data[front];
    }


    /**
     * @return: java.lang.String
     * @author:
     * @date:
     * @description:字符串
     */
    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("LoopQueue: capacity = %d, size= %d \n", getCapacity(), size));
        res.append("front [");
        for (int i = front; i < tail; i = (i + 1) % data.length) {
            res.append(data[i]);
            if ((i + 1)% data.length != tail){
                res.append(", ");
            }
        }
        res.append("] tail.");
        return res.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            loopQueue.enqueue(i);
            System.out.println(loopQueue.toString());
            if (i % 3 == 2) {
                loopQueue.dequeue();
                System.out.println(loopQueue.toString());
            }
        }
        System.out.println(loopQueue.getFront());
    }
}
