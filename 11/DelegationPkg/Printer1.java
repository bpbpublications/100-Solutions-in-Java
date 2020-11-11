/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DelegationPkg;

/**
 *
 * @author dhrutis
 */
public class Printer1 implements IPrinter {

    @Override
    public void printFile(String message) {
        System.out.println("Printer1 is printing: " + message);
    }
}
