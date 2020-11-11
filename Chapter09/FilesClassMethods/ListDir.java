/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 *
 * @author dhrutis
 */
public class ListDir {

    public static void main(String[] args) {
        Path p = Paths.get("D:/Demos");
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(p, "*.txt")) {
            for (Iterator<Path> itr = ds.iterator(); itr.hasNext();) {
                Path p1 = itr.next();
                System.out.println(p1.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            System.err.println(e.getMessage());
        }
    }
}
