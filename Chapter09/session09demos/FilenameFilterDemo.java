/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09demos;

import java.io.FilenameFilter;
import java.io.File;

public class FilenameFilterDemo {

    public static void main(String[] args) {
        String dirPath = "F:/JavaDemos";
        File fObj = new File(dirPath);
        FilenameFilter filterObj = new FileFilter("txt");
        String[] names = fObj.list(filterObj);
        System.out.println("Files count: " + names.length);
        System.out.println("List of Files Found");
        for (int n = 0; n < names.length; n++) {
            System.out.println(names[n]);
        }
    }
}

class FileFilter implements FilenameFilter {

    String fileExtn;

    public FileFilter(String extn) {
        fileExtn = "." + extn;
    }

    @Override
    public boolean accept(File dir, String fileName) {
        return fileName.endsWith(fileExtn);
    }
}
