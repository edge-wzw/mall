/**
 * @ClassName ArrayQueue
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/17 10:42
 * @Version 1.0
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    /**
     * @param capacity:
     * @return: null
     * @author:
     * @date:
     * @description:带参构造器
     */
    public ArrayQueue(int capacity) {
        array = new Array<>(capacity);
    }

    /**
     * @return: null
     * @author:
     * @date:
     * @description:无参构造器
     */
    public ArrayQueue() {
        this(10);
    }

    /**
     * @return: int
     * @author:
     * @date:
     * @description:获取元素个数
     */
    @Override
    public int getSize() {
        return array.getSize();
    }

    /**
     * @return: boolean
     * @author:
     * @date:
     * @description:判断是否为空
     */
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
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
        array.addLast(e);
    }

    /**

     * @return: E
     * @author:
     * @date:
     * @description:出队
     */
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    /**

     * @return: E
     * @author:
     * @date:
     * @description:查看队首元素
     */
    @Override
    public E getFront() {
        return array.getFirst();
    }

    /**

     * @return: java.lang.String
     * @author:
     * @date:
     * @description:
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue : front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1){
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }


    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(5);
        for (int i = 0; i < 10; i++) {
            arrayQueue.enqueue(i);
            System.out.println(arrayQueue.toString());
            if (i%3 ==0){
                arrayQueue.dequeue();
                System.out.println(arrayQueue.toString());
            }
        }
        System.out.println(arrayQueue.getFront());

    }
}
