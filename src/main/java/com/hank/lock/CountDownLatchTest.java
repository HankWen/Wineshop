package com.hank.lock;

import java.util.concurrent.*;

public class CountDownLatchTest {

    public static void test() throws InterruptedException {
        CountDownLatchTest test = new CountDownLatchTest();
        test.limitThread();
    }

    private final ExecutorService executorService = Executors.newFixedThreadPool(100);

    public void limitThread() throws InterruptedException {
        CyclicBarrier cb = new CyclicBarrier(4);

        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try {
                    Thread.sleep(500L);
                    System.out.println("process:" + Thread.currentThread().getId());
                    cb.await();
                    System.out.println("unlock==========:" + finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("done...");

    }
}
