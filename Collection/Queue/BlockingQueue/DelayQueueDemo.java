package Collection.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedTask implements Delayed{
    private final String taskName;

    private final long startTime;

    public DelayedTask(String taskName, long delay,TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis()+ unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining=startTime-System.currentTimeMillis();
        return unit.convert(remaining,TimeUnit.MILLISECONDS);


    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime<((DelayedTask) o).startTime){
            return -1;
        }

        if(this.startTime>((DelayedTask) o).startTime){
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        // Thread safe unbounded blocking queue
        //Elements can only be taken from the queue when their delay ahs expired
        //Useful for scheduling tasks to be executed after certain delay
        // Internally uses Priority Queue
        BlockingQueue<DelayedTask> delayedTaskBlockingQueue = new DelayQueue<>();
        try {
            delayedTaskBlockingQueue.put(new DelayedTask("Task1",5,TimeUnit.SECONDS));
            delayedTaskBlockingQueue.put(new DelayedTask("Task2",3,TimeUnit.SECONDS));
            delayedTaskBlockingQueue.put(new DelayedTask("Task3",10,TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while(!delayedTaskBlockingQueue.isEmpty()){
            DelayedTask task=delayedTaskBlockingQueue.take(); //Blocks until a task's delay expired
            System.out.println("Executed: "+task.getTaskName()+" at "+System.currentTimeMillis());
        }

        // it will run on the basis of priority

        //Executed: Task2 at 1736508427637
        //Executed: Task1 at 1736508429625
        //Executed: Task3 at 1736508434622






    }
}
