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
public class TShirts implements IProduct, IDistributor {

    String tshirts[];

    @Override
    public void addProductDetails() {
        tshirts = new String[3];
        tshirts[0] = "T-shirt A, Red color, Brand A";
        tshirts[1] = "T-shirt B, Blue color, Brand B";
        tshirts[2] = "T-shirt C, Black color, Brand C";
        System.out.println("Product details added");
    }

    @Override
    public void showProductDetails(String prodID) {
        System.out.println("TShirt Details");
        for (String details:tshirts) {
            System.out.println(details);
        }
    }
    
    public void showTShirtSizes(){
        System.out.println("T-shirt Sizes");
        System.out.println("Large");
        System.out.println("Medium");
        System.out.println("Small");
    }

    @Override
    public void addDistributor(String detail) {
        System.out.println("Distributor Added: "+detail);
        
    }

    @Override
    public void processOrder(String orderId) {
        System.out.println("Order Processed: "+orderId);
    }
}