package leetcode;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/17 10:32
 * @Version 1.0
 */
public class Solution {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char toChar = stack.pop();
                if (toChar == '(' && c !=')'){
                    return false;
                }else if (toChar == '[' && c !=']'){
                    return false;
                }else if (toChar == '{' && c !='}'){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
