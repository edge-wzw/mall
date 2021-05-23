package sortAndSearch2_code;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description
 * @Author 15588
 * @Date 2021/5/5 22:09
 * @Version 1.0
 */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

}
