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
public class TestProducts {

    public static void main(String[] args) {
        System.out.println(IProduct.PRODUCTZONE + " Zone");
        TShirts obj = new TShirts();
        obj.addProductDetails();
        System.out.println("-------------------");
        obj.showProductDetails("T001");
        System.out.println("-------------------");
        obj.showTShirtSizes();
        System.out.println("-------------------");
        obj.addDistributor("Dress Smart");
        System.out.println("-------------------");
        obj.processOrder("O001");
    }
}
