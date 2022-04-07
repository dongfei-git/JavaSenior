package tech.dongfei.java;

/**
 * 创建多线程的方式二：实现Runnable接口
 */

class MyThread02 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread02 m1 = new MyThread02();
        Thread t1 = new Thread(m1);
        t1.start();

        Thread t2 = new Thread(m1);
        t2.start();
    }
}
