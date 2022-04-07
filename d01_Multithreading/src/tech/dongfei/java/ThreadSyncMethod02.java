package tech.dongfei.java;

/**
 * 使用同步方法实现Runnable接口同步问题
 */

class MyThread06 extends Thread {
    private static int ticket = 100;  //100票

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            show();
        }
    }

    private static synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票，票号:" + ticket);
            ticket--;
        }
    }

}

public class ThreadSyncMethod02 {

    public static void main(String[] args) {
        MyThread06 t1 = new MyThread06();
        MyThread06 t2 = new MyThread06();
        MyThread06 t3 = new MyThread06();

        t1.start();
        t2.start();
        t3.start();
    }

}
