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
public class PrintManager implements IPrinter {

     private final IPrinter printer;

     public PrintManager(IPrinter printer) {
          this.printer = printer;
     }
     
     @Override
     public void printFile(String message) {
          printer.printFile(message);
     }
    
}
