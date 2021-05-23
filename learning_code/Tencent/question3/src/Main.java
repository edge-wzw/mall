import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/18 21:04
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   //t表示待测试的组数

        for (int i = 0; i < t * 2; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();

        }
    }

    public boolean isEqual(String a, String b){
        if (a == null || a.length() == 0){
            if (b == null || b.length() == 0){
                return true;
            }
            return false;
        }

        if (b == null || b.length() == 0){
            if (a == null || a.length() == 0){
                return true;
            }
            return false;
        }

        if (a.length() != b.length()){
            return false;
        }

        int aLength = a.length();

        if (aLength == 1){
            return a.equals(b);
        }


        //考虑奇数情况
        if (aLength % 2 == 1){
            for (int i = 0; i < aLength; i++) {
                if (a.charAt(i) != b.charAt(i)){
                    return false;
                }
            }
            return true;
        }

        //考虑偶数情况
        while (aLength % 2 == 0){
            aLength = aLength / 2;
            String a1 = a.substring(0, aLength);
            String a2 = a.substring(aLength);
            String b1 = a.substring(0, aLength);
            String b2 = a.substring(aLength);

            boolean e1 = isEqual(a1, b1);
            boolean e2 = isEqual(a2, b2);
            if (e1 || e2){
                return true;
            }else {
                return false;
            }
        }

        return true;
    }
}
