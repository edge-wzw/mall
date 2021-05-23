package day04;

import java.util.Scanner;

/**
 * @author Edge
 * @create 2021-02-20-15:44
 * @description 编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的
 * 值输出其对应的成绩等级：
 * score>=90 等级: A
 * 70<=score<90 等级: B
 * 60<=score<70 等级: C
 * score<60 等级: D
 * 方式一：使用if-else
 * 方式二：使用switch-case: score / 10: 0 - 10
 */
public class TestFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩:");
        int studentscore = scanner.nextInt();

        //if-else
        if (studentscore >=90) {
            System.out.println("等级: A");
        }else if (studentscore >=70) {
            System.out.println("等级: B");
        }else if (studentscore >=60) {
            System.out.println("等级: C");
        }else {
            System.out.println("等级: D");
        }

        //switch-case
        switch (studentscore / 10){
            case 9:
                System.out.println("等级: A");
                break;
            case 8:
            case 7:
                System.out.println("等级: B");
                break;
            case 6:
                System.out.println("等级: C");
                break;
            default:
                System.out.println("等级: D");
                break;
        }
    }
}
