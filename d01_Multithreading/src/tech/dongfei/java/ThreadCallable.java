package tech.dongfei.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable接口创建多线程，---JDK 5.0新增
 */

class NumThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}

public class ThreadCallable {

    public static void main(String[] args) {
        NumThread n1 = new NumThread();
        FutureTask<Integer> f1 = new FutureTask<Integer>(n1);

        new Thread(f1).start();

        try {
            Integer sum = f1.get();
            System.out.println("总和：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
