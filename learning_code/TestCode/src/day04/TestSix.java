package day04;

/**
 * @author Edge
 * @create 2021-02-20-15:53
 * @description 编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行
 * 上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印
 * 输出“baz”。
 */
public class TestSix {
    public static void main(String[] args) {
        for (int i = 0; i <= 150; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print("\t foo");
            }
            if (i % 5 == 0) {
                System.out.print("\t biz");
            }
            if (i % 7 == 0) {
                System.out.print("\t baz");
            }
            System.out.println();
        }
    }
}

