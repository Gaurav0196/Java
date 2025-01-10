package Multithreading.ThreadClass;

public class Test {
    public static void main(String[] args){

        // To execute thread

        World world=new World();

        world.start(); // Start method to initiate the thread
        for(int i=0;i<1000000;i++){
          //  System.out.println("Hello");

            System.out.println(Thread.currentThread().getName()); //
        }
        // System.out.println(Thread.currentThread().getName());
    }
}
