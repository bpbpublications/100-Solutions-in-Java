/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilesClassMethods;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author dhrutis
 */
public class DeleteDemo {

    public static void main(String[] args) {
        try {
            Path p1 = Paths.get("F:/Moved/abc.txt");
            Files.delete(p1);
        } catch (NoSuchFileException ex) {
            System.out.println("No such file or directory: " + ex.getMessage());
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory not empty: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
