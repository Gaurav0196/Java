package Multithreading.VolatileAndAtomic;

public class Atomicity {
    public static void main(String[] args) throws InterruptedException {
        VolatileCounter vc=new VolatileCounter();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                vc.increment();
            }
        });

        Thread t2=new Thread(()->{
            for (int i=0;i<1000;i++){
                vc.increment();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(vc.getCounter());

        // Use volatile when some information is tried to be passed like flag value and all

        //Atomicity--> ensure atomicity(isolation) without using locks

        // java provides Atomic variables that isolates shared resource variables
        //and print correct answer --> 200
        // make variables thread safe
    }
}
