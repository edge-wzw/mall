package day3_1381;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Edge
 * @create 2021-05-12-20:52
 * @description
 */
class CustomStack {

    private int[] stack;
    private int size;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        size = 0;
    }

    public void push(int x) {
        if (size < stack.length){
            stack[size] = x;
            size++;
        }
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int res = stack[size - 1];
        stack[size - 1] = 0;
        size--;
        return res;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < k && i < stack.length; i++) {
            stack[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
