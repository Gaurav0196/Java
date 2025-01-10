package Multithreading.VolatileAndAtomic;

public class SharedResource {

   //private boolean flag=false; // this value passed to thread cache

   private volatile boolean flag=false; // Not passed to thread cache instead to main meory
    public void setFlagTrue(){
        System.out.println("Writer Thread made the flag true!");
        flag=true;
    }

    public void printIfFlagTrue(){
        while(!flag){
            // do nothing
        }

        System.out.println("Flag is true!");
    }


}
