/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaniodemos;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author dhrutis
 */
public class PathsDemo {

    public static void main(String[] args) {
        Path p = Paths.get("D:/Demos/File.txt");
        System.out.println("File Name: " + p.getFileName());
        System.out.println("Parent: " + p.getParent());
        System.out.println("Name Count:" + p.getNameCount());
        System.out.println("Root Directory:" + p.getRoot());
        System.out.print("Is Absolute? ");
        boolean ans = p.isAbsolute();
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //obtain a portion of the path
        System.out.println("Subpath:" + p.subpath(0, 2));

        //combine two paths
        Path p1 = Paths.get("D:/Demos/");
        System.out.println("Combined path: " + p1.resolve("File.txt"));

        //construct a path from one location of a file system
        // to another location
        Path p2 = Paths.get("user");
        Path p3 = Paths.get("home");
        Path pNew = p2.relativize(p3);
        System.out.println("New path:" + pNew);
    }
}
