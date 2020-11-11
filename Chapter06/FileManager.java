/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess6Codes;

/**
 *
 * @author Admin3
 */
public class FileManager {

    String filepath;
    String mode;

    public FileManager() {
    }

    public FileManager(String filepath, String mode){
        this.filepath = filepath;
        this.mode = mode;
    }
// creating a method that throws the custom exception

    public void openFile() throws FileException {
        if (filepath.equals("") || mode.equals("")) {
            throw new FileException();
        } else {
            System.out.println("Openining File…");
        }
    }
}
