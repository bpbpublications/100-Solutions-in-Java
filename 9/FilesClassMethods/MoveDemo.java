/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author dhrutis
 */
public class MoveDemo {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("D:/Demos/abc.txt");
        Path destinationPath = Paths.get("F:/Moved/abc.txt");

        try {
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved");
        } catch (IOException e) {
            //move failed.
            System.out.println("Move Failed: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
