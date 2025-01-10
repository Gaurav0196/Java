package Multithreading.ThreadMethod;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        for(int i=1;i<=5;i++){
//
//            try {
//                Thread.sleep(1000); // sleep method stops execution for current thread i.e. t1 for 1 sec
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread();
        t1.start(); // Start Thread with method start
        t1.join(); // main thread will wait for t1 thread to finish execution

        System.out.println("Hello"); // Hello will ber printed after5 seconds once t1 thread execution is completed









    }
}
