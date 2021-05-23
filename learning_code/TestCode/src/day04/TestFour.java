package day04;

import java.util.Scanner;

/**
 * @author Edge
 * @create 2021-02-20-15:19
 * @description 假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入
 * 一个两位数，然后按照下面的规则判定用户是否能赢。
 * 1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
 * 2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
 * 3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
 * 4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
 * 5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
 * 提示：使用(int)(Math.random() * 90 + 10)产生随机数。
 * Math.random() : [0,1) * 90 [0,90) + 10 [10,100)  [10,99]
 */
public class TestFour {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 90 + 10);
        System.out.println(randomNum);
        int randomNumShi = randomNum / 10;
        int randomNumGe = randomNum % 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入彩票号码（任意两位数）");
        int userNum = scanner.nextInt();
        int userNumShi = userNum / 10;
        int userNumGe = userNum % 10;

        if (randomNumShi == userNumShi && randomNumGe == userNumGe) {
            System.out.println("10000$");
        }else if (randomNumShi == userNumGe && randomNumGe == userNumShi) {
            System.out.println("3000$");
        }else if (randomNumShi == userNumShi || randomNumGe == userNumGe){
            System.out.println("1000$");
        }else if (randomNumShi == userNumGe || randomNumGe == userNumShi) {
            System.out.println("500$");
        }else {
            System.out.println("0$");
        }

    }
}
