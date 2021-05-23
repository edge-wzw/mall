package day04;

/**
 * @author Edge
 * @create 2021-02-20-14:59
 * @description 编写程序，声明2个double型变量并赋值。判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积。
 */
public class TestTwo {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = -2;
        if (num1 > 10 && num2 < 20) {
            System.out.println(num1 + num2);
        } else {
            System.out.println(num1 * num2);
        }
    }
}
