package dp1_code1;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Solution
 * @Description TODO
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn6gq1/
 * int num = random.nextInt(max)%(max-min+1)+min;此时num取值在min到max之间
 * @Author 15588
 * @Date 2021/5/9 21:32
 * @Version 1.0
 */
public class Solution {

    private int[] res;
    private int[] suf;

    public Solution(int[] nums) {
        res = nums;
        suf = res.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        suf = res.clone();
        return suf;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random random = new Random();
        for(int i=0;i<suf.length;i++){
            int num = random.nextInt(suf.length)%(suf.length-0+1)+0;
            if(i!=num){
                int temp=suf[i];
                suf[i]=suf[num];
                suf[num]=temp;
            }
        }
        return suf;
    }


}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */