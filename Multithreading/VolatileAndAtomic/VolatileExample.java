package Multithreading.VolatileAndAtomic;

public class VolatileExample {
    public static void main(String[] args) {

        SharedResource resource=new SharedResource();

        Thread writerThread=new Thread(() -> {
            try {
                Thread.sleep(1000); // For 1 sec reader thread will be stuck in whileLoop
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            resource.setFlagTrue();

        });

        Thread readerThread=new Thread(() -> {
            resource.printIfFlagTrue();

        });

        writerThread.start();
        readerThread.start();

        // Every thread keep local copy of variable in their cache(for performance region).
        // In main memory flg changed to true
        // but reader thread initially cached the value as false and taking that false value only .Hence
        // no printFlagTrue method statement got print

        //eaderThread might remain stuck in the while loop, continually checking a false value of flag.


        // If we don't want the variable to be cached then write volatile keyword
    }
}
