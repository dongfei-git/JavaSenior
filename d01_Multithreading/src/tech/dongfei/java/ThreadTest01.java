package tech.dongfei.java;

/**
 * 多线程的创建一：继承Thread的方法
 *
 */

class MyThread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest01 {

    // 便利100以内的所有偶数
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();

        // 启动一个线程；调用当前线程的run()方法
        t1.start();
    }

}
