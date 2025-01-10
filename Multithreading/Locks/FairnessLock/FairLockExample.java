package Multithreading.Locks.FairnessLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockExample {

    private final Lock fairLock=new ReentrantLock(true); // fairness-->true

    public void accessResource(){
        fairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() +" accquired the lock.");
            Thread.sleep(1000);

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() +" released the lock."); //first print then unlock
            fairLock.unlock();

        }
    }
    public static void main(String[] args) {

        FairLockExample fairLockExample=new  FairLockExample();

        Runnable task=new Runnable() {
            @Override
            public void run() {
                fairLockExample.accessResource();
            }
        };

        Thread t1=new Thread(task,"Thread 1");
        Thread t2=new Thread(task,"Thread 2");
        Thread t3=new Thread(task,"Thread 3");
        Thread t4=new Thread(task,"Thread 4");
        Thread t5=new Thread(task,"Thread 5");

        t1.start();  // It will be in FIFO order  and also avoid starvation(i.e. each thread gets fair chance to execute)

        t2.start();
        t3.start();
        t4.start();
        t5.start();

        /*
        Thread 1 released the lock.
Thread 2 accquired the lock.
Thread 2 released the lock.
Thread 3 accquired the lock.
Thread 3 released the lock.
Thread 4 accquired the lock.
Thread 4 released the lock.
Thread 5 accquired the lock.
Thread 5 released the lock.

         */

    }
}
