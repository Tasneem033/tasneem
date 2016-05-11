/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

/**
 *
 * @author G50
 */
public class enemyfactory {
    public enemyship makeenemy(String newshiptype)
    {
        enemyship newship;
        newship = null;
        if(newshiptype.equals("U"))
        {
            return new ufoenemyship();
        }
        if(newshiptype.equals("R"))
        {
            return new rocketenemyship();
        }
        if(newshiptype.equals("B"))
        {
            return new bigufoenemyship();
        }
        return null;
    }
    
}
