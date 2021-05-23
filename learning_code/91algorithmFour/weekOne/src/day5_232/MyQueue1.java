package day5_232;

import java.util.Stack;

/**
 * @ClassName MyQueue
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/14 20:44
 * @Version 1.0
 */
public class MyQueue1 {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    /** Initialize your data structure here. */
    public MyQueue1() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!s1.isEmpty()) {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int popNum = s2.pop();
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return popNum;
        }
            return -1;
    }

    /** Get the front element. */
    public int peek() {
        if (!s1.isEmpty()) {
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int peekNum = s2.peek();
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return peekNum;
        }
        return -1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }


    public static void main(String[] args) {
        MyQueue1 myQueue = new MyQueue1();
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
