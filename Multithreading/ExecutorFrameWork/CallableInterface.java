package Multithreading.ExecutorFrameWork;

import java.util.concurrent.*;

public class CallableInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable=() -> "hello"; // return type

        //Callable interface contains one method call with return type while runnable has no return type

        Future<String> submit = executorService.submit(callable);
        System.out.println(submit.get());

        executorService.shutdown();

        //submit returns future which have various methods like get and isdone() that can be handy

    }
}
