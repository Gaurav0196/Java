package Multithreading.ThreadMethod;

public class MyThread1 extends Thread{

    public MyThread1(String name){  // Providing name to Threads by creating constructor for Thread class
        super(name);
    }

    @Override
    public void run() {
       for (int i=0;i<=5;i++){
           String a="";
           for(int j=0;j<100000;j++){
               a+="a";
           }
           System.out.println(Thread.currentThread().getName() +" -Priority: "+Thread.currentThread().getPriority()+" - count: "+i);
           try{
               Thread.sleep(100);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }



    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1=new MyThread1("Low Priority Thread");
        MyThread1 t2=new MyThread1("Medium Priority Thread");
        MyThread1 t3=new MyThread1("High Priority Thread");

        // Thread Priority
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY); // There are no strict rules around priority ,these are just hints to
        // JVM to consider these threads a of high or low priority
        t3.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
        t3.start();









    }
}