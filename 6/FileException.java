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
public class FileException extends Exception {

    public FileException() {
    }

    // Overriding the getMessage() method
    @Override
    public String getMessage() {
        return "Could not open file";
    }
}
