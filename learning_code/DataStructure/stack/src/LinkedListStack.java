import com.sun.javafx.css.Size;

import javax.xml.soap.Node;

/**
 * @ClassName LinkedListStack
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/18 19:07
 * @Version 1.0
 */
public class LinkedListStack <E> implements Stack<E>{

    private LinkedList<E> linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public String toString() {
       StringBuffer res = new StringBuffer();
       res.append(String.format("LinkedListStack: size = %d \n", linkedList.getSize()));
       res.append("top [");
        for (int i = 0; i < linkedList.getSize(); i++) {
            res.append(linkedList.get(i));
            if (i != linkedList.getSize() - 1){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        System.out.println(linkedListStack.isEmpty());
        for (int i = 0; i < 10; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack.toString());
            if (i % 5 == 4) {
                linkedListStack.pop();
                System.out.println(linkedListStack.toString());
            }
        }
        Integer peekElement = linkedListStack.peek();
        System.out.println(peekElement);
    }
}
