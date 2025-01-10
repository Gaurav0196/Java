package Multithreading.latchAndBarrier.CyclicBarrier;

import java.util.concurrent.*;

public class CyclicBarrierExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException, BrokenBarrierException {
       // CountDown latch is no re-usable .Once count reaches zero it can't be used

        //Cyclic Barrier can be reused

        int numberOfservices=3; // no. of dependent task to be executed before main thread

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfservices);
        CyclicBarrier barrier=new CyclicBarrier(numberOfservices);


        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));

        // Multiple threads wait at a point until all thread reached that point
        // When last thread reaches at point(barrier) then all threads are released

        // Cyclic barrier doesn't block main thread .

        //  Use case -> where we need certain no. of thread to reach at point before they proeed

        System.out.println("Main");

        barrier.reset();// we can reset barrier unlike latch

        //Resets the barrier to its initial state.
        // If any parties are currently waiting at the barrier, they will return with a BrokenBarrierException.

        barrier.getParties(); //No. of services required to reach this barrier

        executorService.shutdown();



    }



}
