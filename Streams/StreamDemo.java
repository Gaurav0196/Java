package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        // feature introduced in Java 8
        // process collections of data in a functional and declarative manner
        // Simplify data processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        //How to use Stream?
        // a sequence of elements supporting functional and declarative programming
        // source,intermediate operation & terminal operation
        // It is an interface

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
//      //  Stream<Integer> stream = numbers
//                .stream();
        // get count of even numbers

        System.out.println(numbers.stream().filter(x->x%2==0).count()); //Filter method accepts predicate as argument


        // Creating Streams

        //1. From Collections
        List<Integer> num= Arrays.asList(1,2,3,4,5);
        Stream<Integer> collections = num.stream();

        // 2. From Array
        String[] array={"A","B","C"};
        Stream<String> arrayStream = Arrays.stream(array);

        //3.using Stream.of
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);

        // 4> Infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1); // generate takes supplier as input and generate infinite stream
        Stream<Integer> iterate = Stream.iterate(0, x -> x + 1);
        // Finite Stream
        Stream<Integer> finiteInteger= Stream.generate(() -> 1).limit(100);

        List<Integer> collect = Stream.iterate(0, x -> x + 1).limit(100).collect(Collectors.toList());//0,1,2,3,4,45
        System.out.println(collect);



    }
}
