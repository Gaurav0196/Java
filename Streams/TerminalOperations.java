package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 1.collect

        List<Integer> collect = list.stream().skip(1).collect(Collectors.toList());
        System.out.println(collect); //2,3,4,5

        //After java 16 same List can be denoted as
        System.out.println(list.stream().skip(2).toList());

        // 2. FOR EACH
        list.stream().forEach(System.out::println);

        // 3. reduce: Combines elements to produce a single result
        // reduce function argument--> Binary Operator

       //  Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        // 4.count

        // 5. anyMatch,allMatch,noneMatch
        /// anymatch,allmatch argument--> Predicate

        boolean b = list.stream().anyMatch(x -> x % 2 == 0);

        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //6. findFirst ,findAny

        System.out.println(list.stream().findFirst().get()); //optional type
        System.out.println(list.stream().findAny().get());

        //findfirst,FindAny,allmatch,noneMatch,anyMatch these are short circuit operations  as soon as they
        // find a match they stop processing rest of elements

        // Examples

        // Find name whose length is greater than 3
        List<String> list1 = Arrays.asList("Anna", "Bob", "Charlie", "David");
        list1.stream().filter(x->x.length()>3).forEach(System.out::println);

        // Squaring and Sorting Numbers
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
       // list2.stream().map(x->x*x).sorted((o1, o2) -> o2-o1).forEach(System.out::println);
        System.out.println(list2.stream().map(x->x*x).sorted().toList());

        //summing values

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list3.stream().reduce((x,y)->x+y).get());

        System.out.println(list3.stream().reduce(Integer::sum).get());


        // Counting occurrence of a Character(Here check occurrence of character L)

        String sentences="Hello world";
        IntStream chars = sentences.chars(); // IntStream create

        long count = chars.filter(x -> x == 'l').count();
        System.out.println(count);

        // stateful and stateless operation

        // Stateful-> which knows about on which all element it is going to operate. ex-distinct,sort
        //Stateless-> which doesn't know on which all  element it going to operate .ex-map ,filter

        // 7. toArray()-> Converting stream to array


        Object[] array = Stream.of(1, 2, 3, 4, 5).toArray();

        //8. min/max

        Optional<Integer> max = Stream.of(2, 67, 88, 12, 34).max(Comparator.naturalOrder());
        Optional<Integer> min = Stream.of(2, 67, 88, 12, 34).min(Comparator.naturalOrder());
        // Optional<Integer> max = Stream.of(2, 67, 88, 12, 34).max(Comparator.reverseOrder());

        //max and min doesn't mean Greatest or Smallest depends on Comparator defintion
        System.out.println("max "+max.get());
        System.out.println("min "+min.get());

        // Stream can't be reused once terminal operation is called

        //9. foreachOrdered to be used in case of parallel stream to print the elements in order

        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Using foreach with parallel stream");
        list4.parallelStream().forEach(System.out::println); // no particular order
        System.out.println("Using foreachrdered with parallel stream");
        list4.parallelStream().forEachOrdered(System.out::println); //in order


    }
}
