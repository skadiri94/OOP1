package com.skspackage.problemset;

import javax.swing.*;
import java.awt.*;


public class Set1ex4 {
    public static void main (String[]args)
    {

        JTextArea textArea = new JTextArea(14,30);
        Font textFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textFont);


        float length, breadth,perSqrMeter;
        String name;


       //char picked = choice.charAt(0); //extract the String picked and convert it to char

        name = JOptionPane.showInputDialog("Enter your Full Name: ");

        int numChrInName = name.length();
        char initialOfFName = name.charAt(0);
        String nameCapitalized = name.toUpperCase();
        String sName = name.substring(name.lastIndexOf(' '),name.length());



        textArea.setText("Statistics for " + name);


            textArea.append(String.format("\n%-40s%s\n%-40s%s\n%-40s%s\n%-40s%s","The number of characters: ",numChrInName,"The initial of the firstname : ",initialOfFName,
                    "The name entered in capital letters: ",nameCapitalized,"The surname : ",sName));



        JOptionPane.showMessageDialog(null,  textArea , "Distance", JOptionPane.INFORMATION_MESSAGE);






        System.exit(0);
    }
}







