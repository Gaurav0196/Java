package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CF {


    public static void main(String[] args) {

        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "ok";
        });


        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "ok";
        });

        CompletableFuture<Void> f = CompletableFuture.allOf(task1, task2);
        f.join(); // Returns unchecked exception while get returns checked exception
                  // same function as get

        /*
        CompletableFuture.allOf(task1, task2) creates a combined future that completes when both
        task1 and task2 are complete.f.join() waits for all tasks to complete, throwing unchecked exceptions
        if any occur.



        CompletableFuture.allOf(task1, task2) creates a new CompletableFuture that completes when
        all the provided futures (task1 and task2) are complete.It does not return the results of the
        individual futures; instead, it returns a CompletableFuture<Void>.
         */

        System.out.println("Main");

    }
}
