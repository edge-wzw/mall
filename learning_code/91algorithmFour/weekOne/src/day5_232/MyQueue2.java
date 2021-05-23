package day5_232;

import java.util.Stack;

/**
 * @ClassName MyQueue
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/14 20:44
 * @Version 1.0
 */
public class MyQueue2 {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int peekNum;

    /** Initialize your data structure here. */
    public MyQueue2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        peekNum = -1;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
        if (peekNum == -1) {
            peekNum = x;
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!s1.isEmpty()) {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int popNum = s2.pop();
            if (s2.isEmpty()) {
                peekNum = -1;
            }else {
                peekNum = s2.peek();
            }
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return popNum;
        }
            return -1;
    }

    /** Get the front element. */
    public int peek() {
        return peekNum;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }


    public static void main(String[] args) {
        MyQueue2 myQueue = new MyQueue2();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
