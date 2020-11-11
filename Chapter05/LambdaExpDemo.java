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
public class LambdaExpDemo {

    public static void main(String[] args) {
//        IPrintable obj = (String msg) -> {
//            System.out.println(msg);
//        };
//        obj.printMsg("Hello");
        IPrintable obj = (String msg) -> System.out.println(msg);
        obj.printMsg("Invoking printMsg of IPrintable");
        
        IPrintable obj1 = LambdaExpDemo::displayMsg;
        obj1.printMsg("Invoking displayMsg of LambdaExpDemo class");
    }
    
    static void displayMsg(String msg){
        System.out.println(msg);
    }
}
