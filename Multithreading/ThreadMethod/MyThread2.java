package Multithreading.ThreadMethod;

public class MyThread2 extends Thread{

    public MyThread2(String name){  // Providing name to Threads by creating constructor for Thread class
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: "+e);
        }


    }

    public static void main(String[] args)  {

    MyThread2 t=new MyThread2("Gaurav");
    t.start();
    t.interrupt();//interruot the thread i.e. if Thread is sleeping/waiting then wake the thread


//  Console Output --> Thread interrupted: java.lang.InterruptedException: sleep interrupted
        // Exception thrown






    }
}