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
public abstract class enemyship {
    private String name;
    private double amtdamage;
    
    public void setname(String s)
    {
        name=s;
    }
    public String getname() {return name;}
    public void setdamage(double n)
    {
        amtdamage=n;
    }
    public double getdamage() {return amtdamage;}
    public void followheroships()
    {
        System.out.println(getname() + "is following hero");
    }
    
    public void displayenmship()
    {
        System.out.println(getname() + "is on the screen");
    }   
    
    public void enmshoots()
    {
        System.out.println(getname() + "attacks and does " + getdamage() + " damage");
    }    
}
