package Multithreading.ThreadMethod;

public class MyThread4 extends Thread{

    public MyThread4(String name){  // Providing name to Threads by creating constructor for Thread class
        super(name);
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Hello World!");
        }

        // User Thread-> Threads use to implement business logic i.e. Thread t1.JVM waits for these threads
        // to finish their execution


        // Daemon Threads--> Runs in background(ex-Garbage Collector).JVM doesn't wait for Daemon threads to finish
        // their execution





    }

    public static void main(String[] args)  {

        MyThread4 t1=new MyThread4("t1");
//      t1.start();// Hello world will print infinitely and jvm keeps waiting for this thread to finish since
                   // main thread is already completed execution



        // making t1 as daemon thread

        t1.setDaemon(true);
        t1.start(); //here thread is in runnable ,CPU ran few print statement ,then JVM sees this as Daemon thread
                    // and execution stops
        System.out.println("Main Done");







    }
}