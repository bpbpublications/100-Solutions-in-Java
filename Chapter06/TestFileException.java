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
public class TestFileException {
    public static void main(String[] args) {
        FileManager obj = new FileManager("","");
        try{
        obj.openFile();
        }catch(FileException e){
            System.out.println("Exception occurred: "+e.getMessage());
        }
    }
}
