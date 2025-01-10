package Multithreading.ExecutorFrameWork;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class PlayWithExecutors2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService=Executors.newFixedThreadPool(2);

        Callable<Integer> callable1= ()-> {
            System.out.println("Task 1");
            return 1;
        };
        Callable<Integer> callable2= ()-> {
            System.out.println("Task 2");
            return 2;
        };
        Callable<Integer> callable3= ()->{
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> futures = executorService.invokeAll(list);

       // List<Future<Integer>> futures1 = executorService.invokeAll(list,1,TimeUnit.MILLISECONDS);
        // This means all left tasks will be cancelled if timeout limit is crossed and throws exception

        //invokeAny() method doesn't return Future but directly return result of task which ever completes first
        // for ex-Integer

        //invokeall makes main thread wait to complete all tasks

        for(Future<Integer> f:futures){
            System.out.println(f.get());
        }

        executorService.shutdown();
        System.out.println("Completed");


    }
}
