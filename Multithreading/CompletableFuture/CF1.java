package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CF1 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "ok";
        }).thenApply(x->x+x); // do operation on returned value .Here okok will be printed

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "ok";
        }).orTimeout(1,TimeUnit.SECONDS).exceptionally(s->"Timeout Occured"); //Handling exception with exeeptionally

        // here exception will be thrown as Thread is sleeping for 5 sec

       // task1.join();
        task2.join();
        System.out.println(task2.get());
       // System.out.println(task1.get());

        System.out.println("Main");



    }
}
