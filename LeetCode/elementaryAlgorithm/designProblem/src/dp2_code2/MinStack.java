package dp2_code2;

import java.util.*;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/9 21:32
 * @Version 1.0
 */
public class MinStack {

    private Stack<Integer> stack;
    private ArrayList<Integer> arr;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        arr = new ArrayList<>();
    }

    public void push(int val) {
        arr.add(val);
        Collections.sort(arr);
        stack.push(val);
    }

    public void pop() {
        Integer pop = stack.pop();
        arr.remove(pop);

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return arr.get(0);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */