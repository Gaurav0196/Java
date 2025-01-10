package Multithreading.ThreadMethod;

public class MyThread3 extends Thread{

    public MyThread3(String name){  // Providing name to Threads by creating constructor for Thread class
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() );
             Thread.yield(); // A hint to scheduler that current thread is willing to yie;d its current use of processor
                            // Scheduler is free to ignore this hint
        }



    }

    public static void main(String[] args)  {

    MyThread3 t1=new MyThread3("t1");
    MyThread3 t2=new MyThread3("t2");

    t1.start();
    t2.start();

    //without Yield output
  /*
 t1
t1
t1
t2
t2
t2
t2
t2
t2
t2
t2
t1
t1
t1
t1
t1
t1
t1
t2
t2
   */

        // with yield output

        /*
        t1
t1
t1
t2
t1
t1
t1
t1
t1
t1
t1
t2
t2
t2
t2
t2
t2
t2
t2
t2
         */













    }
}