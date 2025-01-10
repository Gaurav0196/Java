package Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

//        int id =1;
//       // System.out.println(getName(id)); // This will give null pointer exception
//
//        // One way to handle it but no efficient aas there can be 100s of methods
//        if(getName(id)!=null){
//            System.out.println(getName(id));
//        }

        Optional<String> name = getName(1);
        if(name.isPresent()){
            System.out.println(name.get());
        }

//  name.ifPresent(x-> System.out.println(x)); //Takes consumer as argument and use of get() method to print value;Ram
     name.ifPresent(System.out::println);

        String nametoBeUsed=name.isPresent()? name.get() : "NA";
        nametoBeUsed=name.orElse("NA");
        nametoBeUsed=name.orElseGet(()->"NA"); // Supplier as a argument
        // nametoBeUsed=name.orElseThrow(()-> new NoSuchElementException());// Take exception supplier as a argument
        nametoBeUsed=name.orElseThrow(NoSuchElementException::new);// Take exception supplier as a argument
        System.out.println(nametoBeUsed);
    }

//    private static String getName(int id){
//        String name=null;
//        return name;
//    }

        // Using Optional

        private static Optional<String> getName(int id){
            String name = null;
           // return Optional.of(name); //if name is null it will give null pointer execption

            return Optional.ofNullable(name); // Values can be null


            //Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.

            //Params:
            //value – the possibly-null value to describe
            //Returns:
            //an Optional with a present value if the specified value is non-null, otherwise an empty Optional
        }

    }
