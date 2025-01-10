package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        // Completable future was introduced in java 8 to handle asynchronous programming


        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "ok";
        }); // This will run in  other thread and main thread will not wait.It won't wait for worker thread
        // complete execution and terminate program

        /*
        The CompletableFuture task runs in a separate thread, allowing the main thread to
        continue without waiting.The main thread prints "Main" and then terminates.
        The worker thread may still be running in the background when the main thread terminates.
         */

        // If we want main thread to wait for worker thread execution the use get method
        String s=null;
        //s = completableFuture.get();//Using completableFuture.get() will make the main thread
        // wait until the CompletableFuture completes.



        s=completableFuture.getNow("no");
            /*This attempts to get the result immediately.

              If the CompletableFuture is not yet complete,
              it returns the provided default value, which is "default value" in this case.

              getNow is useful when you want to check if the result is
              available without blocking the main thread.
             */

        System.out.println(s);

        System.out.println("Main");


    }
}
