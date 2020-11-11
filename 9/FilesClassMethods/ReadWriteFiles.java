/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author dhrutis
 */
public class ReadWriteFiles {

    public static void main(String[] args) {
        Charset c = Charset.forName("US-ASCII");
        String str = "Example of Read Write by using Files class";
        Path p1 = Paths.get("D:/Demos/ReadWrite.txt");
        try {
            BufferedWriter bw = Files.newBufferedWriter(p1, c);
            // write to file
            bw.write(str, 0, str.length());
            bw.close();
            String strRead = null;

            // read from file
//            Path p2 = Paths.get("D:/Demos/ReadWrite.txt");
            BufferedReader br = Files.newBufferedReader(p1, c);
            while ((strRead = br.readLine()) != null) {
                System.out.println(strRead);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
