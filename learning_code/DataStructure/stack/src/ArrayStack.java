/**
 * @ClassName ArrayStack
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/17 10:14
 * @Version 1.0
 */
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    /**
     * @param capacity: 容量
     * @return: null
     * @author:
     * @date:
     * @description:带参数构造器
     */
    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }

    /**
     * @return: null
     * @author:
     * @date:
     * @description:无参构造器，默认容量为10
     */
    public ArrayStack() {
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
     * @return: int
     * @author:
     * @date:
     * @description:获取栈容量
     */
    public int getCapacity() {
        return array.getCapacity();
    }

    /**
     * @param e:
     * @return: void
     * @author:
     * @date:
     * @description:入栈
     */
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    /**
     * @return: E
     * @author:
     * @date:
     * @description:出栈
     */
    @Override
    public E pop() {
        return array.removeLast();
    }

    /**
     * @return: E
     * @author:
     * @date:
     * @description:查看栈顶元素
     */
    @Override
    public E peek() {
        return array.getLast();
    }

    /**
     * @return: java.lang.String
     * @author:
     * @date:
     * @description:输出字符串
     */
    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("Stack: ");
        res.append("[");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }


    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.isEmpty();
        for (int i = 0; i < 10; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack.toString());
            if (i % 3 == 0) {
                arrayStack.pop();
                System.out.println(arrayStack.toString());
            }
        }
        Integer peekElement = arrayStack.peek();
        System.out.println(peekElement);

    }
}
