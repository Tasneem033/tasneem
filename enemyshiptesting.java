/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import java.util.Scanner;

/**
 *
 * @author G50
 */
public class enemyshiptesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        enemyfactory obj = new enemyfactory();
        enemyship theenemy = null;
        Scanner scn = new Scanner(System.in);
        String s= scn.nextLine();
        theenemy = obj.makeenemy(s);
        dosmth(theenemy);
        
        // TODO code application logic here
    }
    public static void dosmth(enemyship obj)
    {
        obj.followheroships();
        obj.displayenmship();
        obj.enmshoots();
    }
}
