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
public class OneDimenArray {

    int score[];

    public OneDimenArray() {

        score = new int[5];
        
        score[0] = 40;
        score[1] = 56;
        score[2] = 76;
        score[3] = 60;
        score[4] = 85;
        System.out.println("Scores Added");
    }

    public void viewScores() {
        System.out.println("Scores are listed below:");

        System.out.println(score[0] + "\n" + score[1] + "\n" + score[2] + "\n" + score[3] + "\n" + score[4]);
    }

    public static void main(String[] args) {

        OneDimenArray obj1 = new OneDimenArray();

        obj1.viewScores();
    }
}
