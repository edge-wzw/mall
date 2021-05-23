package day07;

/**
 * @author Edge
 * @create 2021-02-23-14:31
 * @description
 */
public class TestTwo {
    public static void main(String[] args) {
        int[] arr3 = new int[]{-99,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int number = 255;

        int headidx = 0;
        int endidx = arr3.length - 1;
        while (headidx <= endidx) {
            int mididx = (headidx + endidx) /2;
            if (arr3[mididx] == number) {
                System.out.println("找到了，索引为" + mididx);
                isFlag = false;
                break;
            }else if (arr3[mididx] > number) {
                endidx = mididx - 1;
            }else {
                headidx = mididx + 1;
            }
        }

        if (isFlag) {
            System.out.println("未找到");
        }
    }
}
