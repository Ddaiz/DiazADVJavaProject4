/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diazadvjavaproject4;

import javax.swing.JFrame;

/**
 *
 * @author Dave
 */
public class DiazADVJavaProject4 
{
    public static void main(String[] args) 
    {
       GUI myGUI = new GUI();
       myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       myGUI.setResizable(false);
       myGUI.setSize(800, 775);
       myGUI.setVisible(true);
    }
}
