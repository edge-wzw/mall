package day08;

/**
 * @author Edge
 * @create 2021-02-23-22:40
 * @description 练习7.2：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
 * 的整数，求f(10)的值。
 * 练习7.3：已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 * 其中n是大于0的整数，求f(10)的值。
 * 练习7.4：输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
 * 1 1 2 3 5 8 13 21 34 55
 * 规律：一个数等于前两个数之和
 * 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
 */
public class TestThree {
    public static void main(String[] args) {
        int testNum = arrayThree(10);
        int [] arr = arrayFour(10);
        System.out.println(testNum);
        System.out.println(arr.toString());
    }
    public static int arrayOne(int num){
        if (num == 0){
            return 1;
        }else if (num == 1) {
            return 4;
        }else {
            return 2*arrayOne(num - 1) + arrayOne(num - 2);
        }
    }

    public static int arrayTwo(int num){
        if (num == 20){
            return 1;
        }else if (num == 21) {
            return 4;
        }else {
            return arrayOne(num + 2) - 2*arrayOne(num + 1) ;
        }
    }

    public static int arrayThree (int num){
        if (num == 1 || num == 2){
            return 1;
        }else {
            return arrayThree(num - 1) + arrayThree(num - 2);
        }
    }

    public static int[] arrayFour(int num){
        int [] arrOne = new int[num];
        for (int i=1; i < num;i++) {
            arrOne[i] = arrayThree(i);
            System.out.print(arrOne[i] + "\t");
        }
        return arrOne;
    }
}

