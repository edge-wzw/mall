package day18;/**
 * @author Edge
 * @create 2021$-32$-17$-16:32$
 * @description:
 */

/**
 *@ClassName ThreadTest3
 *@Description TODO
 *@Author 15588
 *@Date 2021/3/17 16:32
 *@Version 1.0
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        MyThread3 myThread3 = new MyThread3();
        myThread3.setPriority(Thread.MAX_PRIORITY);
        myThread3.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread3 extends Thread{
//    private static int num = 100;

    @Override
    public void run (){
        for (int i = 0; i < 100; i++) {
            if (i % 20 == 0) {
                System.out.println(getName() + ":" + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                yield();
            }
            System.out.println(getName() + ":" + i);

        }
    }
}