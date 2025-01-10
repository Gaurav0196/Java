package Multithreading.ThreadCommunication;

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource=new SharedResource();

        Producer producer=new Producer(sharedResource);
        Consumer consumer=new Consumer(sharedResource);

        Thread producerThread=new Thread(producer);
        Thread consumerThread=new Thread(consumer);

        producerThread.start();
        consumerThread.start();

    }
}
