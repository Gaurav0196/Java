package Multithreading.ThreadLifeCycle;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread(); // New State
        System.out.println(t1.getState());

        t1.start(); // Runnable state
        System.out.println(t1.getState());

        Thread.sleep(100);// for 100ms main method execution will be stopped so that JVM will start run method

        System.out.println(t1.getState());

        t1.join(); //Main method Waits for t1 thread to finish

        System.out.println(t1.getState());



    }
}
