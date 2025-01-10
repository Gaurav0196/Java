package Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {

        Optional<String> name = getName(1);
       // we can perform on Operation variable as well
        Optional<String> s = name.map(x -> x.toUpperCase());// Function as argument
        Optional<Integer> s1 = name.map(x -> x.length());

        s.ifPresent(System.out::println);

        long count = s.stream().filter(x -> x.length() > 3).count();
        System.out.println(count);

        s1.ifPresent(System.out::println);


    }


        private static Optional<String> getName(int id){
            String name = "Ram";
            return Optional.ofNullable("Ram");

        }

    }
