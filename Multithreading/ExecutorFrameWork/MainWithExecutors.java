package Multithreading.ExecutorFrameWork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainWithExecutors {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        ExecutorService executorService=Executors.newFixedThreadPool(9);
        // Now we have don't to create threads

        for(int i=1;i<10;i++){
            int finalI=i;

            executorService.submit(()->
                    System.out.println(Factorial(finalI)));




        }

        executorService.shutdown();// Main thread will not wait for executor to shutdown

        try {
            executorService.awaitTermination(100, TimeUnit.SECONDS);// This means
            //wait for 100 seconds to see if all the task terminated else throw exception

            // For unlimited wait time

//            while(!executorService.awaitTermination(10, TimeUnit.MILLISECONDS)){
//                System.out.println("Waiting..");
//            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //wait for 100 seconds to see if all the task terminated else throw exception

        System.out.println("Total Time: "+(System.currentTimeMillis()-startTime));

    }

    private static int Factorial(int i) {
        try {
            Thread.sleep(1000); // let's assume factorial is taking lot's of time to compute
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int fact=1;
        for(int x=1;x<=i;x++){
            fact=fact*x;
        }

        return fact;
    }
    }

