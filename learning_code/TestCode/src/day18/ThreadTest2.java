package day18;/**
 * @author Edge
 * @create 2021$-24$-17$-16:24$
 * @description:
 */

/**
 *@ClassName ThreadTest2
 *@Description TODO
 *@Author 15588
 *@Date 2021/3/17 16:24
 *@Version 1.0
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();

        Thread t1 = new Thread(myThread1);
        Thread t2 = new Thread(myThread1);
        Thread t3 = new Thread(myThread1);

        t1.start();
        t2.start();
        t3.start();

    }
}

class MyThread1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + ticket);
                ticket --;
            }
            else {
                break;
            }
        }
    }
}