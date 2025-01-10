package Multithreading.ExecutorFrameWork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PlayWithExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submit = executorService.submit(() -> 1 + 2);// one of above created threads will do this
        Integer i=submit.get(); //main thread will wait for executor to finish due to get method
        System.out.println("sum is "+i);

        executorService.shutdown();
        System.out.println(executorService.isShutdown()); //true
        Thread.sleep(1);
        System.out.println(executorService.isTerminated()); //true


    }
}
