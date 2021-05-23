package day6_768;

import java.util.*;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/15 20:27
 * @Version 1.0
 */
public class Solution {
    public static int maxChunksToSorted(int[] arr) {
        Map<Integer, Integer> count = new HashMap();
        int ans = 0, nonzero = 0;

        int[] expect = arr.clone();
        Arrays.sort(expect);

        for (int i = 0; i < arr.length; ++i) {
            int x = arr[i], y = expect[i];

            count.put(x, count.getOrDefault(x, 0) + 1);
            if (count.get(x) == 0) nonzero--;
            if (count.get(x) == 1) nonzero++;

            count.put(y, count.getOrDefault(y, 0) - 1);
            if (count.get(y) == -1) nonzero++;
            if (count.get(y) == 0) nonzero--;

            if (nonzero == 0) ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        maxChunksToSorted(arr);
    }
}

//作者：LeetCode
//链接：https://leetcode-cn.com/problems/max-chunks-to-make-sorted-ii/solution/zui-duo-neng-wan-cheng-pai-xu-de-kuai-ii-by-leetco/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
