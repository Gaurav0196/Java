package Collection.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;


    public Consumer(BlockingQueue<Integer> queue) {
        this.queue= queue;
    }

    @Override
    public void run() {
        while (true){

            try {
                Integer take = queue.take();
                System.out.println("Consumer consumed: "+take);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        }

        /*
        Example Execution Flow with Full Queue Scenario:
Initial Queue State: [] (empty)

Time 0s:

Producer: Produces 1 and adds it to the queue.

Queue: [1]

Consumer: N/A (just started)

Time 1s:

Producer: Produces 2 and adds it to the queue.

Queue: [1, 2]

Consumer: Takes 1 from the queue and processes it.

Queue: [2]

Time 2s:

Producer: Produces 3 and adds it to the queue.

Queue: [2, 3]

Time 3s:

Producer: Produces 4 and adds it to the queue.

Queue: [2, 3, 4]

Consumer: Takes 2 from the queue and processes it.

Queue: [3, 4]

Time 4s:

Producer: Produces 5 and adds it to the queue.

Queue: [3, 4, 5]

Time 5s:

Producer: Produces 6 and adds it to the queue.

Queue: [3, 4, 5, 6]

Consumer: Takes 3 from the queue and processes it.

Queue: [4, 5, 6]

Time 6s:

Producer: Produces 7 and adds it to the queue.

Queue: [4, 5, 6, 7]

Time 7s:

Producer: Produces 8 and adds it to the queue.

Queue: [4, 5, 6, 7, 8]

Consumer: Takes 4 from the queue and processes it.

Queue: [5, 6, 7, 8]

Time 8s:

Producer: Produces 9 and tries to add it to the queue, but the queue is full. Producer blocks here and waits.

Queue: [5, 6, 7, 8]

Time 9s:

Consumer: Takes 5 from the queue and processes it. Space becomes available.

Queue: [6, 7, 8]

Producer: Now that there's space, adds 9 to the queue.

Queue: [6, 7, 8, 9]

In this scenario, when the producer produces 9 at time 8s, it finds the queue full ([5, 6, 7, 8]).
The put method blocks, and the producer waits until the consumer consumes an element,
freeing up space in the queue. At time 9s, the consumer takes 5, making space, and the producer then adds 9.
         */

}}
