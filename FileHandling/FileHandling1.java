package FileHandling;

import java.io.*;

public class FileHandling1 {
    public static void main(String[] args) {

       //  FileReader extends InputStreamReader Class

         try(FileReader fr=new FileReader("C:\\Java Revision\\FileHandling\\note.txt")){
             int letter= fr.read();
             while (fr.ready()){
                 System.out.println((char) letter);
                 letter= fr.read();
             }

             System.out.println();

         } catch (IOException e) {
             throw new RuntimeException(e);
         }
// To create new file we use File Class

        // BufferReader --> Reading text from character stream
        // byte to char stream then reading char stream

        //  Here new InputStreamReader(System.in)--> character stream is passed Reader arguments not byte stream


        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed: "+br.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Using fileReader
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Java Revision\\FileHandling\\note.txt")))
        {
         while (br.ready()){
             //System.out.println(br.read());// read ascii value of each character

             System.out.println(br.readLine());
         }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}

