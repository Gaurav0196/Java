package GenericsLearn.GenericsException;

public class MyException extends Exception{



    // Work around to handle exception in generics

    // Generic class can't extend exception due to type eraser(Generic type information is removed at runtime)

    public<T> MyException(T value){
        super("Exception related to value: "+
                value.toString()+" of type: "+
                value.getClass().getName());
    }

    public static void main(String[] args) {
        try{
            throw new MyException(123);
        }catch(MyException e){
            System.out.println("caught exception:" + e.getMessage());
        }

        try{
            throw new MyException("String");
        }catch(MyException e){
            System.out.println("caught exception:" + e.getMessage());
        }
    }
}
