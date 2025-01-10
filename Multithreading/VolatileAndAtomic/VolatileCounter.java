package Multithreading.VolatileAndAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {
    //

    private AtomicInteger counter=new AtomicInteger(0);

    public void increment(){
       // counter++;

        counter.incrementAndGet();
    }

    public int getCounter(){
       // return counter;

        return counter.get();
    }




}
