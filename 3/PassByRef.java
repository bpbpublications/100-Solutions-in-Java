/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess3Codes;

/**
 *
 * @author Admin3
 */
public class PassByRef {
    // Method to calculate area of a circle that
// takes the object of class Circle as a parameter

    public float areaCircle(CommonVals objPi, float r) {
// Use getPI() method to retrieve the value of PI
        float area = objPi.getPI() * r * r;

// Print the value of area of circle
//        System.out.println("Area of the circle is " + area);
        objPi.Pi = 3.15f;
        //System.out.println("Modified the value of PI is "+objPi.PI);
        return area;
    }

    public static void main(String[] args) {
        PassByRef p1 = new PassByRef();

        CommonVals c1 = new CommonVals();
        System.out.printf("Area of circle is %03.2f", p1.areaCircle(c1, 3));
        System.out.printf("\nModified value of PI is %01.2f %n",c1.getPI());
    }
}

class CommonVals {

    float Pi = 3.14f;

    public float getPI() {
        return Pi;
    }
}
