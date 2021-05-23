package day02;

/**
 * @author Edge
 * @create 2021-02-19-20:04
 */
public class StringTestOne {
    public static void main(String[] args) {
        //练习一
        char c1 = 'a';
        int i1 = 10;
        String s1 = "hello";

        System.out.println(c1 + i1 + s1); //107hello
        System.out.println(c1 + s1 + i1);   //ahello10
        System.out.println(c1 + (i1 + s1)); //a10hello
        System.out.println((c1 + i1) + s1); //107hello
        System.out.println(s1 + i1 + c1);   //hello10a


        //练习二
        System.out.println("*  *");     //*  *
        System.out.println('*' + '\t' + '*');   //值相加   93
        System.out.println('*' + "\t" + '*');   //*  *
        System.out.println('*' + '\t' + "*");   //前两个值相加，所得的值在加上字符串"*"  50*
        System.out.println('*' + ('\t' + "*"));     //*  *

        //PPT练习1
//        String str1 = 4;    //判断对错    错误
        String str2 = 3.5f + "";    //判断str2对错  正确
        System.out.println(str2);   //输出：3.5
        System.out.println(3 + 4 + "Hello!");    //7Hello!
        System.out.println("Hello!" + 3 + 4);    //Hello!34
        System.out.println('a' + 1 + "Hello!");    //98Hello!
        System.out.println("Hello!" + 'a' + 1);    //Hello!a1
        System.out.println("中文测试");


    }
}
