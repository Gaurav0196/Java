package Multithreading.ThreadCommunication;

public class SharedResource {

    public int data;

    private boolean hasData;

    /*
    Business Logic --. when hasData is true the producer waits to produce and Consumer consumes
                       hasData
     */

    public synchronized void produce(int value) throws InterruptedException {
     while (hasData){
         wait();
     }

     data=value;
     hasData=true;

        System.out.println("Produced: " +value);
     notify(); // notify to consume data
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData){
            wait();

        }
        hasData=false;
        System.out.println("Consumed: " +data);

        notify();

        return data;

    }
}
