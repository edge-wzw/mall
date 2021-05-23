package day04;

import java.util.Scanner;

/**
 * @author Edge
 * @create 2021-02-20-15:09
 * @description 我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
 * 一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
 * 相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
 * 编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人
 * 类的年龄。如果用户输入负数，请显示一个提示信息。
 */
public class TestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入狗的年龄：");

        int dogAge = scanner.nextInt();
        if (dogAge < 0) {
            System.out.println("输入的年龄信息错误，请输入正确的年龄(非负数)");
        }
        else if (dogAge <= 2 && dogAge > 0) {
            System.out.println("狗的年龄相当于" + (dogAge * 10.5) + "岁的人类");
        } else {
//            int dogAgeTemp = dogAge - 2;
//            int actualDogAge = (dogAgeTemp * 4) + 21;
            System.out.println("狗的年龄相当于" + ((dogAge - 2) * 4 + 21) + "岁的人类");
        }
    }
}
