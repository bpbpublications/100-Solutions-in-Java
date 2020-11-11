/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author dhrutis
 */
public class CopyDemo {

    public static void main(String[] args) {
        Path p1 = Paths.get("D:/Demos/copy.txt");
        URI uri1 = URI.create("https://www.yahoo.com/");
        try (InputStream is = uri1.toURL().openStream()) {
            //copy input stream to a file
            Files.copy(is, p1, StandardCopyOption.REPLACE_EXISTING);
        } catch (final MalformedURLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
