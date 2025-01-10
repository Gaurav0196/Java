package Multithreading.latchAndBarrier.CyclicBarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class DependentService implements Callable<String> {

    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {


            System.out.println(Thread.currentThread().getName() +" service started");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +" is waiting at the barrier");
            barrier.await();


        return "ok";
    }
}
