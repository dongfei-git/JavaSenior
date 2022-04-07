package tech.dongfei.java;

/**
 * 代码块方法，实现Runnable接口方式
 */

class MyThread03 implements Runnable {
    private int ticket = 100;  //100票
//    Object obj = new Object();  //多个线程必须使用同一把锁

    @Override
    public void run() {
        while (true) {
            synchronized (this) {  //同步代码块，锁

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

public class ThreadSynchronized {
    public static void main(String[] args) {
        MyThread03 m1 = new MyThread03();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);

        t1.start();
        t2.start();
        t3.start();
    }
}
