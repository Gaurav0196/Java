package Multithreading.latchAndBarrier;

import java.util.concurrent.*;

public class CountDownLatchExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        Future<String> future3 = executorService.submit(new DependentService());
//
//
//        future1.get();
//        future2.get();
//        future3.get();
//
//        // let's say to do a task we want these dependent services to start first .Then main task executes
//        //But the problem in above approach is we have to create different future ,which will be tedious
//        // task in case of high number of dependent services . CountDownLatch fix this
//
//        System.out.println("All dependent service finished.Starting main thread!");
//        executorService.shutdown();

// Using CountDown latch now

        int numberOfservices=3; // no. of dependent task to be executed before main thread

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfservices);
        CountDownLatch latch=new CountDownLatch(numberOfservices);

        // CountDown latch is used when we want one or more thread to wait

        // countdown of no. of services will be 3 once it reaches to zero main thread will be accessible

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));

        latch.await();

       // latch.await(1,TimeUnit.SECONDS); in this latch will wait for a second and then main method will start
        // in this since we have 2 sec sleep in dependent service main method runs before dependent service tasks


        System.out.println("Main");

        executorService.shutdown();



    }



}
