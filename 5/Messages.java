/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess5Codes;

/**
 *
 * @author Admin3
 */
public class Messages implements IPrintable {

    @Override
    public void printMsg(String msg) {
        System.out.println("Received Message: " + msg);
    }

    public static void main(String[] args) {
        Messages obj = new Messages();
        obj.printMsg("Good Morning");
    }
}
