/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity;

import java.awt.Color;
import javax.swing.*;
import static java.lang.Thread.sleep;

/**
 *
 * @author CORECOMP
 */
public class Splash {
    static private JFrame Splash;
    private JLabel JL;
    public Splash(){
    
        Splash=new JFrame("");
        Splash.setLocation(600,100);
        Splash.getContentPane().setBackground(Color.ORANGE);
         Splash.setLayout(null);
        
        JLabel JL = new JLabel("WELCOME TO E-BILLING...");
        JL.setFont(JL.getFont().deriveFont(30.0f));
        JL.setBounds(150,100,640,300);
        Splash.add(JL);
        
        Splash.setDefaultCloseOperation(Splash.EXIT_ON_CLOSE);
        Splash.setResizable(false);
        Splash.setSize(720,720);
        Splash.setVisible(true);
    }
    
    public static void main(String args[]){
    
    new Splash();
    try{
    sleep(3000);
    Splash.dispose();
    Login N= new Login();
    }
    catch(Exception e){
    
    }
    }
    
}
