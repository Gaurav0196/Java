package Multithreading.Locks.ReadWriteLocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count=0;

    private final ReadWriteLock lock=new ReentrantReadWriteLock();
    // To distinguish between read and write operation

    // ReadWriteLock allows multiple thread to read resources concurrently as long as no Thread is writing to it.
    //i.e. No write lock has been acquired by another thread

    // Multiple thread can acquire unlike ReentrantLocks where one thread can use the lock at a time

    private final Lock readLock=lock.readLock();

    private final Lock writeLock= lock.writeLock();


    public void increment() throws InterruptedException {
        writeLock.lock();
        try{
            count++;
            Thread.sleep(100);
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReadWriteCounter readWriteCounter=new ReadWriteCounter();

        Runnable readtask=new Runnable() {
            @Override
            public void run() {

                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + " read: "+readWriteCounter.getCount());
                }


            }
        };

        Runnable writetask=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    try {
                        readWriteCounter.increment();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " write: "+ "incremented");
                }

            }
        };


        Thread writeThread=new Thread(writetask);
        Thread readThread1=new Thread(readtask);
        Thread readThread2=new Thread(readtask);

        writeThread.start();
        readThread1.start();
        readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final Count: "+ readWriteCounter.getCount());

        /*
        Execution Order:
The writer thread acquires the writeLock and increments the count,
holding the lock for 1 second before releasing it.
During this 1-second period, the reader threads are blocked, unable to read the count.
Once the writer releases the writeLock, the reader threads acquire the readLock and read the
updated value of count.
         */



    }
}
