package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        // Collectors is a utility class
        // 1. Collecting to a List

        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> stringList = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());

        System.out.println(stringList);
        
        // 2. Collection to Set

        List<Integer> integers = List.of(1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7);
        Set<Integer> set = integers.stream().collect(Collectors.toSet());
        System.out.println(set);
        
        //3. Collecting to specified Collection
        
        //toCollection take supplier as argument

       ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect);
        
        //4. Joining Strings
        // concatenate stream elements into a single string
        String concenatedNames = names.stream().collect(Collectors.joining());
        System.out.println(concenatedNames); //AliceBobCharlie
        String collect1 = names.stream().collect(Collectors.joining(", "));
        System.out.println(collect1);

        //5. Summarizing Data
        // Generates statistical summary(count,sum,min,average,max)

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        IntSummaryStatistics collect2 = integerList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("count: "+collect2.getCount());
        System.out.println("sum: "+collect2.getSum());
        System.out.println("min: "+collect2.getMin());
        System.out.println("average: "+collect2.getAverage());
        System.out.println("max: "+collect2.getMax());


        //6.Calculating Average

        Double average = integerList.stream().collect(Collectors.averagingDouble(x->x));
        System.out.println("Average is "+average);

        //7.counting elements

        Long counting = integerList.stream().collect(Collectors.counting());
        System.out.println("Count is: "+counting);

        //8. Grouping elements

        List<String> words = List.of("collecting", "world", "java", "streams", "hello");
        Map<Integer, List<String>> integerListMap = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(integerListMap);
        Map<Integer, String> map = words.stream().
                collect(Collectors.groupingBy(String::length, Collectors.joining(", ")));
        // Once you have grouped ,you can perform actions on the group
        System.out.println(map);

        Map<Integer, Long> map1 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        // Function,Collector
        System.out.println(map1);

        // 3rd type if we want specific map output
        TreeMap<Integer, Long> tree = words.stream().
                collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        // Function,Supplier,Collector-> arguments

        System.out.println(tree);

        // 9. partitioning elements
        // partition elements into two groups based on predicate
        System.out.println("Partitioning By: ");
        Map<Boolean, List<String>> partition = words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
        System.out.println(partition); //{false=[world, java, hello], true=[collecting, streams]}
        Map<Boolean, String> partition1 = words.stream().
                collect(Collectors.partitioningBy(x -> x.length() > 5, Collectors.joining(", ")));

        System.out.println(partition1); //{false=world, java, hello, true=collecting, streams}


        // 10.Mapping and Collecting
        // Applies a mapping function before Collecting
        //  Arguments--> Function, DownStream Collector

        List<String> mapping = words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList()));
        System.out.println(mapping);

        // Example 1: Collecting Names by length
        System.out.println("Example 1");
        List<String> nameString = List.of("Anna", "Bob", "Alexander", "Brian", "Alice");
        Map<Integer, List<String>> nameByLength = nameString.stream().
                collect(Collectors.groupingBy(String::length));
        System.out.println(nameByLength);

        //Example 2: Counting Word Occurrence
        System.out.println("Example 2");

        String sentence="hello world hello java world";
        String[] s = sentence.split(" ");
//        Map<String, Long> example2 = Arrays.stream(s).
//                collect(Collectors.groupingBy(x->x, Collectors.counting()));
        Map<String, Long> example2 = Arrays.stream(s).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(example2);

        System.out.println("Example 3");

        // Example 3: Portioning evan and odd number
        List<Integer> example3 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> ex3 = example3.stream().
                collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()));

        System.out.println(ex3);

        // Example 4 Summing value in map:

        System.out.println("Example 4");

        Map<String,Integer> items=new HashMap<>();
        items.put("Apple",10);
        items.put("Orange",20);
        items.put("Guava",30);
        //Integer example4 = items.values().stream().collect(Collectors.summingInt(x -> x));
        Optional<Integer> example4 = items.values().stream().reduce((x, y)->x+y);
        System.out.println(example4);

        // Example 5 : Create a map from Stream elements

        System.out.println("Example 5");
        // Key-Fruit Name  Value-> length of String

        List<String> fruitList = Arrays.asList("Apple", "Guava", "cherry");
        Map<String, Integer> example5 = fruitList.stream().
                collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length()));
        // another variant
        System.out.println(example5);

        TreeMap<String, Integer> ex5 = fruitList.stream().
                collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length(), (word1, word2) -> word1, TreeMap::new));
        System.out.println(ex5); //K,V,MergeFunction,TreeMap

        //mergeFunction:Function to handle key collision.The merge function keeps the first word in case of collison

        //Example 6:
        List<String> apple = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> ex6 = apple.stream().collect(Collectors.toMap(x -> x, v -> 1, (x, y) -> x + y));

        System.out.println(ex6);

        //Merge Function ->Binary Operator .Initially apple 1 when apple again come again the merge function adds and
        //increase the count


    }
}
