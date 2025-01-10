package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFWithPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "ok";
        },executorService);

        executorService.shutdown();

    }
}
