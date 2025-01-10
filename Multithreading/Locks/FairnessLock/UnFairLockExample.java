package Multithreading.Locks.FairnessLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnFairLockExample {

    private final Lock unFairLock=new ReentrantLock();

    public void accessResource(){
        unFairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() +" accquired the lock.");
            Thread.sleep(1000);

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() +" released the lock."); //first print then unlock
            unFairLock.unlock();

        }
    }

    public static void main(String[] args) {
        UnFairLockExample unFairLockExample=new UnFairLockExample();

        Runnable task=new Runnable() {
            @Override
            public void run() {
                unFairLockExample.accessResource();
            }
        };

        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        Thread t3=new Thread(task,"Thread 3");
        Thread t4=new Thread(task,"Thread 4");
        Thread t5=new Thread(task,"Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        /*
        Thread 1 accquired the lock.
Thread 1 released the lock.
Thread 2 accquired the lock.
Thread 2 released the lock.
Thread 4 accquired the lock.
Thread 4 released the lock.
Thread 3 accquired the lock.
Thread 3 released the lock.
Thread 5 accquired the lock.
Thread 5 released the lock.

Locking is happening in arbitrary order ,sas there is no sequence in acquiring and releasing lock .Hence Unfair lock.


         */


    }


}
