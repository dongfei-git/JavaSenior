package tech.dongfei.java;

/**
 * 代码块方法，继承Thread类方式
 */

class MyThread04 extends Thread {
    private int ticket = 100;  //100票
//    private static Object obj = new Object();  //多个线程必须使用同一把锁

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread04.class) {  //同步代码块，锁

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class ThreadSynchronized02 {
    public static void main(String[] args) {
        MyThread04 t1 = new MyThread04();
        MyThread04 t2 = new MyThread04();
        MyThread04 t3 = new MyThread04();

        t1.start();
        t2.start();
        t3.start();
    }
}
