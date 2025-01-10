package Multithreading.Syncronization;

public class Test {
    public static void main(String[] args) {
        Counter counter=new Counter();

        MyThread t1=new MyThread(counter); // counter object is shared between two threads and modifying count
        MyThread t2=new MyThread(counter);
        t1.start();
        t2.start();

        // Since both threads are running simultaneously ,there might be instance where at same time both thread
        //tried incrementing value leading to count not coming to 2000. This can be fixed using synchronization
        // This condition is called race condition(before using synchronized keyword)

        // synchronization will make sure if thread t1 is executing increment method then thread t2 will wait
        // This is called mutual exclusion




        try{
            t1.join();

            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
