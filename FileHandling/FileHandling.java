package FileHandling;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileHandling {
    public static void main(String[] args) {

         try(InputStreamReader isr=new InputStreamReader(System.in)){
             System.out.print("Enter Some Letters: ");
             int letters=isr.read(); // read has int return type see implementation
             while(isr.ready()){
                 System.out.println(letters); //This gives ASCII Value
                 System.out.println((char) letters); // Converts ASCII Value to character
                 letters= isr.read();
                 /*
                 If you don't write isr.read() inside the while loop, the program will behave incorrectly
                 because the letters variable will not be updated with the next character in the input stream.
                 This will result in the program repeatedly processing the same character that was initially read.
                  */
             }
             System.out.println();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }


    }
}
