package skspackage;

import javax.swing.*;

import javax.swing.JTextArea;
import java.awt.Font;


public class Set1ex2 {
    public static void main (String[]args)
    {

        JTextArea textArea = new JTextArea(14,30);
        Font textFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textFont);
        textArea.setText(String.format("%-20s%3s\n%-20s%3s\n","Yards","Inches","-----","-----"));

        int yards, inches;


       //char picked = choice.charAt(0); //extract the String picked and convert it to char
         //gbp = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter an Amount :\n","1 GBP = 1.12877 EUR", JOptionPane.INFORMATION_MESSAGE));

        for(int i = 1;i <= 10;i++) {

            yards = i;
            inches = yards * 3 * 12;

            textArea.append(String.format("%d%20d\n", yards,inches));

        }

        JOptionPane.showMessageDialog(null,  textArea , "Distance", JOptionPane.INFORMATION_MESSAGE);






        System.exit(0);
    }
}







