package Multithreading.RunnableInterface;

public class Test {
    public static void main(String[] args){

        // To execute thread

        World world=new World();

        Thread t1=new Thread(world);// Create a instance of thread and pass object of World class to Constructor of thread

        t1.start(); // Run  method to initiate the thread
        for(int i=0;i<1000000;i++){
          //  System.out.println("Hello");

            System.out.println(Thread.currentThread().getName()); //
        }
        // System.out.println(Thread.currentThread().getName());
    }
}
