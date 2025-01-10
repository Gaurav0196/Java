package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100;

    /*

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);

        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" proceeding with withdraw ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -=amount;

            System.out.println(Thread.currentThread().getName()+" completed withdrawl.Remaining balance:  "+balance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance ");
        }
    }

    //Problem with Synchronized here .First let say t1 thread comes to execute this method that means t2 will
     // wait until t1 execution is completed.It may happen let say thread.sleep is of more time so and
    // execution may take longer time due to this t2 is also not able to proceed with transaction this is the
    // issue with synchronized(automatic lockk) keyword. */


    // solution using Manual Lock

    private final Lock lock=new ReentrantLock();
    public void withdraw(int amount){

        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+amount);
        try {lock.lockInterruptibly();

           // lock.lock() --> same as synchronized
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance>=amount){
                    try{


                    System.out.println(Thread.currentThread().getName()+" proceeding with withdraw ");
                    Thread.sleep(3000);

                    balance -=amount;

                    System.out.println(Thread.currentThread().getName()+" completed withdrawl.Remaining balance:  "+balance);} catch (
                            InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }


                }
                else{
                    System.out.println(Thread.currentThread().getName()+" insufficient balance ");
                }

            }else{
                System.out.println(Thread.currentThread().getName()+" Could not accquire the lock will try again later");

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();


        }

    }


}
