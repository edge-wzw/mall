package array9_code36;

/**
 * @ClassName TestCode
 * @Description TODO
 * 判断一个9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 数字1-9在每一行只能出现一次。
 * 数字1-9在每一列只能出现一次。
 * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-sudoku
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/25 9:06
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        char[][] suDoKu = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Solution sol = new Solution();
        boolean validSudoku = sol.isValidSudoku(suDoKu);
        System.out.println(validSudoku);

    }
}

//思路一：官方思路，但是采用数组存储数据
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int boxIndex = (i / 3) * 3 + j / 3;

                    if (row[i][num] == 1) {
                        return false;
                    } else {
                        row[i][num] = 1;
                    }

                    if (col[j][num] == 1) {
                        return false;
                    } else {
                        col[j][num] = 1;
                    }

                    if (box[boxIndex][num] == 1) {
                        return false;
                    } else {
                        box[boxIndex][num] = 1;
                    }
                }
            }
        }
        return true;
    }
}