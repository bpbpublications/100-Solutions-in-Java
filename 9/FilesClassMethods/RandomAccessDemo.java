/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

/**
 *
 * @author dhrutis
 */
public class RandomAccessDemo {

    public static void main(String[] args) {
        String str = "This is random access example\n";
        byte buff[] = str.getBytes();
        ByteBuffer bufAlloc = ByteBuffer.allocate(10);

        //store the data of the string into the byte buffer
        ByteBuffer bufWrap = ByteBuffer.wrap(buff);
        // set the path of the file to read/write
        Path p1 = Paths.get("D:/Demos/Random.txt");
        //create a new file if does not exist
        try (FileChannel fc = (FileChannel.open(p1, CREATE, READ, WRITE))) {
            //read the first 10 bytes of the file
            int readC;
            do {
                readC = fc.read(bufAlloc);
                // display the number of characters read
                System.out.println("Total characters read: " + readC);
            } while (readC != -1 && bufAlloc.hasRemaining());
            // write the readChar at the beginning of the file.
            fc.position(0);
            while (bufWrap.hasRemaining()) {
                fc.write(bufWrap);
            }
            bufWrap.rewind();
            // Move to the end of the file and 
            //copy the first 10 bytes 
            long length = fc.size();
            fc.position(length - 1);
            //flip the buffer 
            bufAlloc.flip();
            while (bufAlloc.hasRemaining()) {
                fc.write(bufAlloc);
            }
            while (bufWrap.hasRemaining()) {
                fc.write(bufWrap);
            }
        } catch (IOException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
