/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

/**
 *
 * @author Admin3
 */
import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File obj = new File("F:/JavaDemos/FirstFile.txt");

//        File obj = new File("F:/JavaDemos", "FirstFile.txt");
        System.out.println("File exists is: " + obj.exists());
        System.out.println("File is: " + obj.isFile());
        System.out.println("Path is: " + obj.getPath());
        System.out.println("Name is: " + obj.getName());
    }
}
