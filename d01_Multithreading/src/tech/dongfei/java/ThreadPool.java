package tech.dongfei.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 使用线程池创建多线程
 */

class NumberThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        // 设置线程池的属性
        service.setCorePoolSize(100);

        for (int i = 0; i < 100; i++) {
            service.execute(new NumberThread());  //执行线程
        }

        service.shutdown();  // 关闭线程池
    }

}
