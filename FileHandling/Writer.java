package FileHandling;

import java.io.*;

public class Writer {
    public static void main(String[] args) {
        // OutputStream Writer

        OutputStream os=System.out;
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World !");
            osw.write(97);
            osw.write(10); // new line
            osw.write('A');
            osw.write('\n');
            char[] arr="hello World".toCharArray();
            osw.write(arr); // Prints to console







        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(FileWriter fw=new FileWriter("C:\\Java Revision\\FileHandling\\note.txt",true)){
            fw.write("Hello World ! My name is Gaurav");
            fw.write(97);
            fw.write(10); // new line
            fw.write('A');
            fw.write('\n');
            char[] arr="hello World".toCharArray();
            fw.write(arr); // Overrides original file and write its own content
            // For appending write true in FileWriter Constructor

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
        1. Buffering:
FileReader/FileWriter: These classes interact directly with the underlying file system for every read/write operation. This can be slow because each operation involves accessing the disk, which is time-consuming.
BufferedReader/BufferedWriter: These classes use an in-memory buffer to group multiple I/O operations into a single, larger operation, significantly reducing the number of times the file system is accessed.
Example:

Without buffering: Reading/writing one character at a time means multiple disk accesses, which is inefficient.
With buffering: Reads/writes a block of characters at once, reducing overhead.
2. Performance:
BufferedReader/BufferedWriter: Operate faster, especially for large files, because the buffered approach minimizes the number of I/O calls.
FileReader/FileWriter: Slower due to repeated disk I/O for each character or small chunk of data.
         */


        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Java Revision\\FileHandling\\note.txt")))
        {

            bw.write("Hare krishna");
            bw.newLine(); // Inserts a new line
            bw.write("This is the second line.");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
