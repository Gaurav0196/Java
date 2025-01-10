package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {
        //Intermediate operations transform a stream into another stream
        //They are lazy, meaning they don't execute until a terminal operation is invoked

        List<String> list= Arrays.asList("Akshit","Ram","Shyam","Ghanshyam","Akshit");
        // Filter

        Stream<String> name = list.stream().filter(x -> x.startsWith("A"));
        // No filtering at this point
        // Filter here is doing intermediate operation that us transforming one Stream to another stream

        long count = list.stream().filter(x -> x.startsWith("A")).count();
        // count is terminal information here meaning now filtering is done

        System.out.println(count);

        // 2.map
        // map takes Function as argument

        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted

        Stream<String> sorted = list.stream().sorted();// sort in natural order
        Stream<String> sorted1 = list.stream().sorted((a, b) -> b.length() - a.length());// custom sorting logic


        // 4. distinct

        Stream<String> a = list.stream().filter(x -> x.startsWith("A")).distinct();

        // intermediate operation over intermediate operation returns Stream only unless terminal operation called

        System.out.println(a.count());

        // 5.limit
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1).limit(100);
        System.out.println(iterate.collect(Collectors.toList()));

        // 6.skip
        Stream<Integer> skip = Stream.iterate(1, x -> x + 1).skip(10).limit(100);
        //here skip will first 10 elements and and start from 11
        System.out.println(skip.collect(Collectors.toList()));

        // 7.peek- performs an action on each element as it is consumed
        // For each used to end operation but if we want to do something in between then we use peek
        Stream.iterate(1,x->x+1).limit(100).peek(System.out::println).count();

        // 8.flatMap
        //Handle Streams of collections,lists or arrays where each element is itself a collection
        // Flatten nested structures(e.g. lists within lists) so that they can be processed as a single sequence of element

        List<List<String>> listOfLists=Arrays.asList(
                Arrays.asList("appple","banana"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grape")
        );
        System.out.println(listOfLists.get(1).get(1));

        System.out.println(listOfLists.stream().flatMap(x->x.stream()).map(String::toUpperCase).toList());


        List<String> list1 = Arrays.asList("Hello World",
                "Java streams are powerful",
                "flatmap is useful");

        // Separate each of these in a list like : hello,world,java,streams,are

        System.out.println
                (list1.stream().flatMap(sentence->Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());



    }
}
