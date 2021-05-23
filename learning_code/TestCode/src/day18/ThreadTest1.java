package day18;/**
 * @author Edge
 * @create 2021$-12$-17$-16:12$
 * @description:
 */

/**
 *@ClassName ThreadTest1
 *@Description 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 *@Author 15588
 *@Date 2021/3/17 16:12
 *@Version 1.0
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

    }
}

class MyThread extends Thread{
    private static int ticket = 100;

    @Override
    public void run(){
        while (true) {
            if (ticket > 0) {
                System.out.println(currentThread().getName() + ":" + ticket);
                ticket --;
            }
            else {
                break;
            }
        }

    } 
}