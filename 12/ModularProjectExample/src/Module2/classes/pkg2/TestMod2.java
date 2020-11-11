/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author Admin3
 */

import pkg1.ModClass1;

public class TestMod2 {
    public String getModMessages() {
        ModClass1 objMod1 = new ModClass1();
        ModClass2 objMod2 = new ModClass2();
        return objMod1.getMod1Msg() + " " + objMod2.getMod2Msg();
    }

}
