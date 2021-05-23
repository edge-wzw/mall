package array10_code48;

/**
 * @ClassName TestCode
 * @Description TODO
 * 48. 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * @Author 15588
 * @Date 2021/3/25 10:39
 * @Version 1.0
 */
public class TestCode {
}

//思路一：通过建立辅助矩阵的方式，首先建立一个和原始矩阵等容量的新矩阵，然后根据公式：
// 旋转前位置matrix（row）(col)-->旋转后位置：matrix(col)(n-1-row)，
// 其中n为图像边长，将原始矩阵的数值存入新矩阵，最后将新矩阵的数值赋值给原始矩阵
// 缺点：不符合题意（即不使用额外数组实现）
//执行用时：0ms,在所有 Java 提交中击败了100.00%的用户
//内存消耗：38.5MB,在所有 Java 提交中击败了69.48%的用户
//class Solution {
//    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//        int [][] matrixTemp = new int [n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrixTemp[j][n-1-i] = matrix[i][j];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = matrixTemp[i][j];
//            }
//        }
//    }
//}

//思路：两次翻转，沿着水平轴翻转一次，主对角线翻转一次
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}

