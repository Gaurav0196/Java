package Multithreading.RunnableInterface;

public class World implements Runnable{
    @Override
    public void run() {

        for(int i=0;i<1000000;i++){
            // System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }

    }
}
