package Multithreading.ExecutorFrameWork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorService {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

//        scheduledExecutorService.schedule
//                (()-> System.out.println("Task executed after 5 sec delay!"),5, TimeUnit.SECONDS);

        // At want to do some at fixed rate
        ScheduledFuture<?> scheduledFuture1 = scheduledExecutorService.scheduleAtFixedRate
                (() -> System.out.println("Task executed after every 5 sec delay!"),
                        5, 5, TimeUnit.SECONDS); //Overlapping is task let say 10 second to
        // execute then this will execute the  next task irrespective of previous task completed


        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("Task executed after every 5 sec delay!"),
                5, 5, TimeUnit.SECONDS);
        //oNe task ccomplete then it will wait for 5 sec to start new task.Hence no overlapping



        scheduledExecutorService.schedule(()->
        {
            System.out.println("Initaiting shutdown!");
            scheduledExecutorService.shutdown();
        },20,TimeUnit.SECONDS);


  // Executors.newCachedThreadPool()-->Creates new Thread according to the requirement and thread
        //is not required it will terminate the thread after 60 seconds of inactivity .
        //Also there is no limit on Thread creation i.e risk ,adjust pool size dynamically

        // Risk --> as this is not fixed pool

        // Suitable for variable load ,Load is short lived. Not suitable for Long task
    }
}
