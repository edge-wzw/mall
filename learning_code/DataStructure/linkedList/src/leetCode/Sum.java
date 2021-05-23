package leetCode;

/**
 * @ClassName Sum
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/19 20:49
 * @Version 1.0
 */
public class Sum {
    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int l) {
        if (l == arr.length) {
            return 0;
        }
        return arr[l] + sum(arr, l + 1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = sum(arr);
        System.out.println(res);
    }
}
