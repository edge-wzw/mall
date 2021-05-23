package day04;

/**
 * @author Edge
 * @create 2021-02-20-14:50
 * @description
 */
public class TestOne {
    public static void main(String[] args) {
        /*
        定义三个int变量，并用三元运算符和if-else找到最大整数
         */
        int num1 = 10;
        int num2 = -10;
        int num3 = 100;
        int max_num;
        //三元运算符
        max_num = (((num1 > num2) ? num1:num2) > num3) ? ((num1 > num2) ? num1:num2):num3;
        System.out.println(max_num);
        //if-else
        if (num1 > num2) {
            if (num1 > num3) {
                max_num = num1;
            }else {
                max_num = num3;
            }
        }else {
            if (num2 > num3) {
                max_num = num2;
            }else {
                max_num = num3;
            }
        }
        System.out.println(max_num);
    }
}
