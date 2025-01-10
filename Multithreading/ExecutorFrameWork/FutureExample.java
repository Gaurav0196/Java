package Multithreading.ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(() -> 42);
//
//        if(future.isDone()){
//            System.out.println("Task is done"); // not printed sout task is done yet.Waiting for future.get complete
//
//        }
        System.out.println(future.get()); // if we want to return anything .submit() we can return using submit


        if(future.isDone()){
            System.out.println("Task is done");

        }
    }
}
