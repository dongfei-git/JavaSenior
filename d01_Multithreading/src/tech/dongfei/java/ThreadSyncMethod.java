package tech.dongfei.java;

/**
 * 使用同步方法实现Runnable接口同步问题
 */

class MyThread05 implements Runnable {
    private int ticket = 100;  //100票

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

    private synchronized void show() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票，票号:" + ticket);
            ticket--;
        }
    }

}

public class ThreadSyncMethod {

    public static void main(String[] args) {
        MyThread05 m1 = new MyThread05();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);

        t1.start();
        t2.start();
        t3.start();
    }

}
