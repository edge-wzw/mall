package day03;

/**
 * @author Edge
 * @create 2021-02-19-21:27
 * 练习2
 * 随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值。
 * 格式如下：
 * 数字xxx的情况如下：
 * 个位数：
 * 十位数：
 * 百位数：
 * 例如：
 * 数字153的情况如下：
 * 个位数：3
 * 十位数：5
 * 百位数：1
 */
public class TestTwo {
    public static void main(String[] args) {
        //自己的方法，通过转换为字符数组，然后输出对应位数上的值
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一个三位数的整数：");
//
//        int num = scanner.nextInt();
//        char[] numCharArray = valueOf(num).toCharArray();
//        if (numCharArray.length != 3 ) {
//            System.out.println("输入错误，请输入符合条件的整数");
//        }else {
//            System.out.println("三位数" + num + "的百位数为" + numCharArray[0] + ", 十位数为" + numCharArray[1] + ", 个位数为" + numCharArray[2]);
//        }

        //课堂方法
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一个三位数的整数：");
//        int num = scanner.nextInt();
//
//        int numbai = num / 100;
//        int numshi = num % 100 / 10;
//        int numge = num % 10;
//        System.out.println("三位数" + num + "的百位数为" + numbai + ", 十位数为" + numshi + ", 个位数为" + numge);

        //面试题z=46
//        boolean x=true;
//        boolean y=false;
//        short z=42;
//         //if(y == true)
//        if((z++==42)&&(y=true))z++;
//        if((x=false) || (++z==45)) z++;
//
//        System. out.println("z="+z);

        //交换两个变量的值
        //对于基本数据类型数据
        int a = 10;
        int b = 20;
        System.out.println("修改前，a为" + a + ", b为" + b);

        //方法一
//        a += b;
//        b = (a - b);
//        a -= b;
//        System.out.println("修改后，a为" + a + ", b为" + b);

        //方法二
        a = a ^ b;  //a=30, b=20
        b = a ^ b;  //a=30, b=10
        a = a ^ b;  //a=20, b=10
        System.out.println("修改后，a为" + a + ", b为" + b);

        //对于字符串
        String str1 = "Tom";
        String str2 = "Bob";
        System.out.println("修改前，str1为" + str1 + ", str2为" + str2);
        String strTemp = str2;
        str2 = str1;
        str1 = strTemp;
        System.out.println("修改后，str1为" + str1 + ", str2为" + str2);


    }
}
