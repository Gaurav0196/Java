package Collection.Queue.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new SynchronousQueue<>();
        Thread producer=new Thread(()->{
            System.out.println("Producer is waiting to transfer...");
            try {
                queue.put("Hello from producer");
                System.out.println("producer has transferred the message");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer was interrupted");
            }

        });

        Thread consumer=new Thread(()->{
            System.out.println("Consumer is waiting to receive...");
            try {
                String message= queue.take();

                System.out.println("Consumer Received: "+message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted");
            }

        });

        producer.start();
        consumer.start();



    }
}
