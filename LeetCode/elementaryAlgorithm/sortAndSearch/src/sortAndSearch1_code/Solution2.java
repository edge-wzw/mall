package sortAndSearch1_code;

/**
 * @ClassName Solution
 * @Description 88. 合并两个有序数组 https://leetcode-cn.com/problems/merge-sorted-array/
 * 方法二：逆向双指针
 * @Author 15588
 * @Date 2021/5/5 22:09
 * @Version 1.0
 */
public class Solution2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int cur;
        int tail = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                cur = nums2[p2--];
            }else if (p2 == -1){
                cur = nums1[p1--];
            }else if (nums1[p1] < nums2[p2]){
                cur = nums2[p2--];
            }
            else {
                cur = nums1[p1--];
            }
            nums1[tail--] = cur;

        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
