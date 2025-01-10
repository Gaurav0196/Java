package Multithreading.ExecutorFrameWork;

public class Main {

    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        Thread[] threads=new Thread[9];

        for(int i=1;i<10;i++){
            int finalI=i;
            threads[i-1]=new Thread(()->
            {


                System.out.println(Factorial(finalI));  //The lambda ()-> { System.out.println(Factorial(i)); } captures i,
                                                   // but since i keeps changing during the loop,
                                                   // it violates the "effectively final" rule.
            });
            threads[i-1].start();



        }
        for(Thread thread:threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total Time: "+(System.currentTimeMillis()-startTime));

        // Execution time decreases due to multithreading Total Time: 1012 earlier time -> 9000

        // Probles -> 1. we are creating threads here manually
        // 2. No reuse of threads as we have to create 9 threads
    }

    private static int Factorial(int i) {
        try {
            Thread.sleep(1000); // let's assume factorial is taking lot's of time to compute
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int fact=1;
        for(int x=1;x<=i;x++){
            fact=fact*x;
        }

        return fact;
    }
}
