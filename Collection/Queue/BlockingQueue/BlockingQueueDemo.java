package Collection.Queue.BlockingQueue;

import java.util.Comparator;
import java.util.concurrent.*;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        //All Queue which we have seen earlier are not Thread safe
        //BlockingQueue is thread safe
        //wait for queue to become non-empty/wait for space
        // Simplify concurrency problem like producer -consumer
        // In standard queue--> immediately operation done
            // empty--> remove (no waiting)
            // full--> add (no waiting)

        //Blocking queue
            //put--> Blocks if the queue is full until space becomes available
            //take --> Blocks if the queue is empty ,until an element becomes available
            //offer--> Waits for space to become available,up to the specified timeout

        BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(5); //fixed capacity of 5

        // ArrayBlockingQueue: A bounded ,blocking queue backed by an array
        // low memory overhead
        //uses a single lock for both enqueue and dequeue operation
        //// More Threads--> problem

        Thread producer=new Thread(new Producer(blockingQueue));
        Thread consumer=new Thread(new Consumer(blockingQueue));
        producer.start();
        consumer.start();

        // Another implementation of blocking queue:Linked Blocking Queue

        BlockingQueue<Integer> blockingQueue1=new LinkedBlockingQueue<>();
        //If no capacity provided then queue of capacity Integer.MAX is created
        // optionally bounded
        //Backed by Linked List
        //Uses two separate locks for enqueue and dequeue operations
        //Higher concurrency between producers and consumers

        BlockingQueue<Integer> blockingQueue2=new PriorityBlockingQueue<>(11, Comparator.reverseOrder()); //initial capacity-11
        // unbounded // so put method won't block
        // Binary Heap as array and can grow dynamically
        //Head is based on their natural ordering or a provided comparator like priority queue

        BlockingQueue<Integer> blockingQueue3=new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
        //it can't store elements.
        //Capacity of at most 1 elements












    }
}
