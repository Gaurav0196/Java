package Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);
        // IntStream: A sequence of primitive int-valued function elements supporting sequential
        // and parallel aggregate operations.

        //Similarly ,DoubleStream ,FloatStream,CharacterStream

        IntStream range = IntStream.range(1, 5); // 1 inclusive ,5-exclusive

        System.out.println(range.boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));// 1 and 5 both inclusive

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);

        DoubleStream doubles = new Random().doubles(5); // 5 random doubles we will get
        IntStream intStream1 = doubles.mapToInt(x -> (int) x + 1);
       // System.out.println(intStream1);

        System.out.println(doubles.boxed().collect(Collectors.toList()));

        //Boxed

        //Stream<Integer> boxed = range.boxed();

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().collect(Collectors.toList()));


    }
}
