/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author Admin3
 */

import pkg1.ModClass1;
import pkg2.ModClass2;

public class TestMod3 {
    public String getAllMessages() {
        ModClass1  objMod1 = new ModClass1();
        ModClass2 objMod2 = new ModClass2();
        ModClass3  objMod3 = new ModClass3();
        return objMod1.getMod1Msg() + ", " + objMod2.getMod2Msg()  + ", " + objMod3.getMod3Msg();
    }
}
