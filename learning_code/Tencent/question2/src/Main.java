import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/18 20:13
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //n表示用户数量
        int k = sc.nextInt();   //k表示广告数目

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  //存储发送广告的时间间隔
        }

        int count = 0;
        int idx = 1;

        while (count < k) {
            for (int i = 0; i < n; i++) {
                if (idx % arr[i] == 0) {
//                    System.out.println(i + 1);
                    System.out.println("idx:" + idx + ", i:" + (i + 1));
                    count++;
                    if (count == k){
                        break;
                    }
                }
            }
            idx++;
        }



    }
}
