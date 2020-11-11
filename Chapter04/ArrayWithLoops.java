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
public class ArrayWithLoops {

    int score[];
    int scores[][];

    public ArrayWithLoops() {

        score = new int[5];

        score[0] = 40;
        score[1] = 56;
        score[2] = 76;
        score[3] = 60;
        score[4] = 85;
        System.out.println("Scores Added to One-dimensional Array");

        scores = new int[5][2];

        scores[0][0] = 40;
        scores[0][1] = 60;
        scores[1][0] = 56;
        scores[1][1] = 45;
        scores[2][0] = 76;
        scores[2][1] = 65;
        scores[3][0] = 60;
        scores[3][1] = 74;
        scores[4][0] = 85;
        scores[4][1] = 90;
        System.out.println("Scores Added to Two-dimensional Array");

    }

    public void viewScores() {
        System.out.println("Scores of one-dimensional array are:");

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }

        System.out.println("Scores of two-dimensional array are:");

        for (int row = 0; row < scores.length; row++) {
            System.out.println("Player " + (row + 1));

            for (int col = 0; col < scores[row].length; col++) {
                System.out.println(scores[row][col]);
            }
        }
    }
    public static void main(String[] args) {
        ArrayWithLoops obj = new ArrayWithLoops();
        obj.viewScores();
    }
}


