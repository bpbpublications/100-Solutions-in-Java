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
public class TestPrinter {

    public static final String MSG = "Good Morning";

    public static void main(String[] args) {
        
        // PrintManager delegates work to Printer1 and Printer2
        PrintManager printer1 = new PrintManager(new Printer1());
        PrintManager printer2 = new PrintManager(new Printer2());

        printer1.printFile(MSG);
        printer2.printFile(MSG);
    }
}
