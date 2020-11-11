/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess4Codes;

/**
 *
 * @author Admin3
 */
public class MultiDimenArray {

    int score[][];

    public MultiDimenArray() {

        score = new int[5][2];

        score[0][0] = 40; score[0][1] = 60;
        score[1][0] = 56; score[1][1] = 45;
        score[2][0] = 76; score[2][1] = 65;
        score[3][0] = 60; score[3][1] = 74;
        score[4][0] = 85; score[4][1] = 90;
        System.out.println("Scores Added");
    }

    public void displayMarks() {
        System.out.println("Scores are listed below:");

        System.out.println("Player 1:" + score[0][0] + "," + score[0][1]);
        System.out.println("Player 2:" + score[1][0] + "," + score[1][1]);
        System.out.println("Player 3:" + score[2][0] + "," + score[2][1]);
        System.out.println("Player 4:" + score[3][0] + "," + score[3][1]);
        System.out.println("Player 5:" + score[4][0] + "," + score[4][1]);
    }

    public static void main(String[] args) {

        MultiDimenArray obj1 = new MultiDimenArray();
        obj1.displayMarks();
    }
}
