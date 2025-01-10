package ExceptionHandling;

import java.sql.SQLException;

public class Test {

    public static void level3(){
        int[] array=new int[5];
        array[5]=10;
    }

    public static void level2(){
       level3();
    }

    public static void level1(){
       level2();
    }
    public static void main(String[] args) {


        try {
            level1();
        } catch (Exception e) { // e--. it got(detailed msg) printed using toStringMethod of Throwable Class
                                // which is parent clas sof Exception class
//            StackTraceElement[] stackTrace=e.getStackTrace();
//            for(int i=0;i< stackTrace.length;i++){
//                System.out.println(stackTrace[i]);
//            }
            e.printStackTrace();
        }

        // Unchecked Exception :- These are not checked by Compiler at Compile time ex- ArryIndexoutofBound ,NullPointer Exception
        // Checked Exception checked at compile time .Ex-- IO Exception


        // Try with Resources:if within try class of that object is written which is implementing autoclosable interface
        //then we don't need finally block and it will automatically close it

        //Ex- try(BufferReader reader=new BufferReader(new FileReader("example.txt"))){}
        //catch(Exception e){} example -BufferReader

    }

}
