package day05;

import java.util.Scanner;

/**
 * @author Edge
 * @create 2021-02-20-16:03
 * @description 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 * 说明：break关键字的使用
 */
public class TestOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();

        boolean isFlagOne = true;
        for (int i = (num1 < num2) ? num1:num2; i>1; i--){
            if ((num1 % i ==0) && (num2 % i ==0)) {
                System.out.println("最大公约数为:" + i);
                isFlagOne = false;
                break;
            }
        }
        if (isFlagOne) {
            System.out.println("没有最大公约数");
        }

        for (int i = (num1 > num2) ? num1:num2; i<= (num1*num2); i++){
            if ((i % num1 == 0) && (i % num2 == 0)){
                System.out.println("最小公倍数为:" + i);
                break;
            }
        }

    }
}
