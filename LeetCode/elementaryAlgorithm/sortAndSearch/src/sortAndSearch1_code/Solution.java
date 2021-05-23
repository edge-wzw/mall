package sortAndSearch1_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Solution
 * @Description 88. 合并两个有序数组 https://leetcode-cn.com/problems/merge-sorted-array/
 * 方法一：全部添加到nums1中后再排序
 * @Author 15588
 * @Date 2021/5/5 22:09
 * @Version 1.0
 */
public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        int[] nums1 =  {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 =  {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
