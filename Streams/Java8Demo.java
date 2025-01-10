package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

interface MathOperation{
    int operation(int a,int b);
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

public class Java8Demo {
    public static void main(String[] args) {
        // Streams

        //Java 8 --> Minimal Code,functional programming
        // java 8-> lambda Expression,Streams,Date and Time Api


        //Lambda Expression
        // Lambda Expression is an anonymous function(no name,no return type,no access modifier)
        // Used to implement Functional Interface

        // remove access modifiers ,name,return type _-> Lambda expression

//        MathOperation mathOperation=(int a,int b)->{
//          return a+b;
//        };
//
        //if there is one statement then we can remove curly braces as well> Also data types

        MathOperation sumOperation= (a,b) -> a+b;
        MathOperation subOperation= (a,b) -> a-b;
        int res=sumOperation.operation(2,5);

        System.out.println(res);

        //Predicate--> Functional Interface(Boolean valued function) has one abstract method(boolean test(T t);
        //Predicate holds one condition only. we are holding condition in variable i.e Functional programming

        Predicate<Integer> isEven= x->x%2==0;
        System.out.println(isEven.test(4));
        Predicate<String> startsWithA=x->x.toLowerCase().startsWith("a");
        Predicate<String> endsWithH=x->x.toLowerCase().endsWith("h");
        Predicate<String> and= startsWithA.and(endsWithH); //And Operation
        System.out.println(startsWithA.test("ayush"));
        System.out.println(and.test("ayush"));


        // Function -> Functional Interface has one abstract method -- R apply(T t);
        //Represents a function that accepts one argument and produces a resul
        Function<Integer,Integer> doubleIt=x->2*x;
        Function<Integer,Integer> tripleIt=x->3*x;
        System.out.println(doubleIt.andThen(tripleIt).apply(2)); // First double then result obtained is tripled
        //compose
        System.out.println(doubleIt.compose(tripleIt).apply(4)); //First triple and then double

        System.out.println(doubleIt.apply(2));

       // Function.identity() -> static method in Function Interface that's why called with interface name
        // Input is returned as output

        Function<Integer,Integer> identuity=Function.identity();
        System.out.println(identuity.apply(5)); // 5 Will be returned


        // Consumer -Functional Interface with abstract method :void accept(T t);
        //Represents an operation that accepts a single input argument and returns no result.
        Consumer<Integer> consumer= x-> System.out.println(x);
        consumer.accept(51);

        List<Integer> print= Arrays.asList(1,2,3);

        Consumer<List<Integer>> printList=x->{
            for (int i:x){
                System.out.println(i);
            }
        };
        printList.accept(print);

        //Supplier --> functional Interface with abstract method:  T get();
        //Represents a supplier of results. No argumets/input but still provides result



        Supplier<String> giveHelloWorld=()->"hello World";
        System.out.println(giveHelloWorld.get());

        //Combined Example

        Predicate<Integer> predicate=x->x%2==0;
        Function<Integer,Integer> function=x->x*x;
        Consumer<Integer> consumer1=x-> System.out.println(x);
        Supplier<Integer> supplier=()->100;

        if(predicate.test(supplier.get())){
            consumer1.accept(function.apply(supplier.get())); // 10000
        }

        // BiPredicate,BiConsumer,BiFunction

        //BiPredicate->Represents a predicate (boolean-valued function) of two arguments.
        // This is the two-arity specialization of Predicate.
        //This is a functional interface whose functional method is test(Object, Object).
        BiPredicate<Integer,Integer> biPredicate=(x,y)->(x+y)%2==0;
        System.out.println(biPredicate.test(2,4));

        // BiConsumer->Represents an operation that accepts two input arguments and returns no result.
        // This is the two-arity specialization of Consumer. void accept(Object, Object).

        BiConsumer<Integer,String> biConsumer=(x,y)->{
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(2,"Hi");

        //BiFunction->Represents a function that accepts two arguments and produces a result.
        // This is the two-arity specialization of Function.
        //This is a functional interface whose functional method is apply(Object, Object)
        //R apply(T t, U u);

        BiFunction<String,String,Integer> biFunction=(x,y)->(x+y).length();
        System.out.println(biFunction.apply("Hi","Hello"));

        //Let's consider the below example here we have to write Integer,Integer two times .To ease this Unary operator
        // was introduced
        Function<Integer,Integer> f=x->2*x;
        //Unary Operator-> extend Function Interface
        //Represents an operation on a single operand that produces a result of the same type as its operand.
        // This is a specialization of Function for the case where the operand and result are of the same typ

        UnaryOperator<Integer> unaryOperator=x->2*x;
        System.out.println(unaryOperator.apply(5));

        //Binary Operator-> extends Bifunction Interface

        //Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
        // This is a specialization of BiFunction for the case where the operands and the result are all of the same type.

        BinaryOperator<Integer> b=(x,y)->x+y;
        System.out.println(b.apply(2,4));


        //Method References-> use method without invoking and in place of lambda expression
        List<String> fruits = List.of("Apple", "Guava", "Mango");
        fruits.forEach(x-> System.out.println(x));//For Each method accepts consumer
        // Replacing Lambda with method reference
        fruits.forEach(System.out::println); //Giving method as reference

        //Constructor Reference
        List<String> names = List.of("A", "B", "C");
       // List<MobilePhone> mobilePhones = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());

        List<MobilePhone> mobilePhones = names.stream().map(MobilePhone::new).collect(Collectors.toList()); //Constructor reference






    }


}
