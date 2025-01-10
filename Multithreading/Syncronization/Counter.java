package Multithreading.Syncronization;

public class Counter {
    private int count=0;

//    public synchronized void increment(){
//        count++;
//    }

    public  void increment(){   // critical section
        synchronized (this){    /* synchronized block example if we want synchronization in a block */
                                // this refer to one instance ensure for one instance where multiple
                                // thread are called ,at one time only one thread will access
        count++;}
    }

    public int getCount() {
        return count;
    }
}
