package tech.dongfei.java;

/**
 * Thread中的常用方法:
 *
 * void start(): 启动线程，并执行对象的run()方法
 * run(): 线程在被调度时执行的操作
 * String getName(): 返回线程的名称
 * void setName(String name):设置该线程名称
 * static Thread currentThread(): 返回当前线程。在Thread子类中就
 * 是this，通常用于主线程和Runnable实现类
 * static void yield()：线程让步
 * 暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
 * 若队列中没有同优先级的线程，忽略此方法
 * join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将
 * 被阻塞，直到 join() 方法加入的 join 线程执行完为止
 * 低优先级的线程也可以获得执行
 * static void sleep(long millis)：(指定时间:毫秒) 令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后
 * 重排队。
 * 抛出InterruptedException异常
 * stop(): 强制线程生命期结束，不推荐使用
 * boolean isAlive()：返回boolean，判断线程是否还活着
 */

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                try {
                    sleep(1000); // 阻塞1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":"+i);
            }

            if(i%20==0){
                yield();  // 释放当前CPU执行权
            }
        }
    }
}

public class ThreadMethod {

    public static void main(String[] args) throws InterruptedException {
        // 设置主线程名
        Thread.currentThread().setName("MainThread000");
        Thread.sleep(10000);

        HelloThread t1 = new HelloThread();

        //设置线程名
        t1.setName("Thread001");

        t1.start();

        System.out.println(t1.isAlive());  // 判断线程是否存活

        try {
            t1.join();  // 等待子线程的结束
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
