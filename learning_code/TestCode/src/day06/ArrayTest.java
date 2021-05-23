package day06;

/**
 * @author Edge
 * @create 2021-02-16-11:44
 */
public class ArrayTest {
    public static void main(String[] args) {
        int num;
        num =10;
        int id = 1;
        //一维数组声明与定义
        int [] ids; //声明
        ids = new int[]{100,200,3,4};
        String[] names = new String[10];
        int [] arr = {1,2,3,4,5};

        names[0] = "Tom";
        names[1] = "Bob";
        names[2] = "Lucy";
        names[3] = "Lay";
        names[4] = "Tony";

        //遍历一维数组
        for (int i=0;i< names.length; i++){
            System.out.println(names[i]);
        }

    }
}
