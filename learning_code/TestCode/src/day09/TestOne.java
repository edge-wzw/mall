package day09;

/**
 * @author Edge
 * @create 2021$-59$-03$-19:59$
 * @description:
 */
public class TestOne {
    public static void main(String[] args) {
        int numTwo = sevenTwo(10);
        int numTHree = sevenThree(10);
        int numFour = sevenFour(10);

        System.out.print(numTwo + ",\t" + numTHree + ",\t" + numFour);

    }

    public static int sevenTwo(int num){
        if (num == 0) {
            return 1;
        }else if (num == 1) {
            return 4;
        }else {
            return 2 * sevenTwo(num - 1) + sevenTwo(num - 2);
        }
    }

    public static int sevenThree(int num){
        if (num == 20) {
            return 1;
        }else if (num == 21) {
            return 4;
        }else {
            return sevenThree(num + 2) - 2 * sevenThree(num + 1);
        }
    }

    public static int sevenFour(int num){
        if (num == 1 || num == 2) {
            return 1;
        }else {
            return sevenFour(num - 1) + sevenFour(num - 2);
        }
    }
}

