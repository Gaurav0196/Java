package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        // A type of Stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the streams simultaneously
        // This can significantly improve performance for large data sets

        long startTime=System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> list1 = list.stream().map(ParallelStreams::factorial).toList();

        long endTime=System.currentTimeMillis();

        System.out.println("Time taken with Stream: "+(endTime-startTime) +"ms"); // 1623 ms

        // Now using parallel stream

        long startTime1=System.currentTimeMillis();
        List<Long> list2 = list.parallelStream().map(ParallelStreams::factorial).toList();

        long endTime1=System.currentTimeMillis();

        System.out.println("Time taken with Parallel Stream: "+(endTime1-startTime1) +"ms"); // 21 ms

        //Parallel Streams are most effective for CPU-intensive or large datasets where tasks are independent

        // They may add overhead for simple tasks or small datasets

        // Cumulative Sum
        //{1,2,3,4,5} --> {1,3,6,10,15}
        // Parallel stream approach will give incorrect results as tasks are not independent

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
       // int sum=0; // local variable used inside Lambda Expression should be final or effectively final
        // To achieve thread safety we will be using Atomic Integer

        AtomicInteger sum=new AtomicInteger(0);


//
//        numbers.parallelStream().map(x->
//        {
//            int i=x +sum;
//            sum=i;
//            return i;
//        }).toList();

//        List<Integer> list3 = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
//        // addAndGet--> Atomically adds the given value to the current value,
//
//        System.out.println(list3); //[15, 7, 10, 14, 5] wrong result these are not independent

        // Fixing this

        List<Integer> list3 = numbers.stream().map(x -> sum.addAndGet(x)).toList();

        System.out.println(list3); //[1, 3, 6, 10, 15]


        // sequential() --> to convert parallel stream to sequential stream



    }

    private static long factorial(int n){
        long result=1;

        for(int i=2;i<=n;i++){
            result*=i;
        }

        return result;
    }
}
