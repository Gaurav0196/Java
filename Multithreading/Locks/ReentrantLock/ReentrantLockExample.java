package Multithreading.Locks.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock=new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }



    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        } finally {
            lock.unlock();
           // lock.unlock();// if this is written instead of finally in outer method then lock will be completely unlocked here
        }
    }

    // ReentrantLock class avoid deadlock condition there as within outer method inner method is called
    // And code will run without any issue
    // inner method is able to re-acquire lock in inner method as sa,e thread holds it i.e main thread

    // ReentrantLock allows thread to acquire the same lock multiple times without causing a deadlock.


    //WHen ReentrantLock is used count is maintained that how may times lock is acquired

    // Each lock call must be paired with unlock call



    public static void main(String[] args) {
        ReentrantLockExample reentrantLock=new ReentrantLockExample();
        reentrantLock.outerMethod();

    }


}
