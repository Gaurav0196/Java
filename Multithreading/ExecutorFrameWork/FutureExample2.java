package Multithreading.ExecutorFrameWork;

import java.util.concurrent.*;

public class FutureExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
                Thread.sleep(2000);
                return 42;

        }
        );

//        Integer i=null;
//        i=future.get(1, TimeUnit.SECONDS); ///Excepts result in 1 seconds else throws Timeout exception
//        System.out.println(future.isDone());
//        System.out.println(i);

        future.cancel(true); // if wants to cancel task

       // future.cancel(false);// it will cancel task but if the task is running then
        //it will not interrupt the task

        System.out.println(future.isCancelled());
        System.out.println(future.isDone());

        executorService.shutdown();

    }
}
