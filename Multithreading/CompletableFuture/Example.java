package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<Void> oddTask = CompletableFuture.runAsync
                (() -> { for (int i = 1; i <= 10; i++) { if (i % 2 != 0)
                { System.out.println("Odd: " + i); } } }, executorService);

        CompletableFuture<Void> evenTask = CompletableFuture.runAsync
                (() -> { for (int i = 1; i <= 10; i++) { if (i % 2 == 0)
                { System.out.println("Even: " + i); } } }, executorService);

        CompletableFuture<Void> allOf = CompletableFuture.allOf(oddTask, evenTask);

        allOf.join(); // Wait for both tasks to complete executorService.shutdown();
        executorService.shutdown();


    }
}