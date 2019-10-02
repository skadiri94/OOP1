package com.skpackage.problem.set1;

import javax.swing.*;
import java.awt.*;


public class Set1ex3 {
    public static void main (String[]args)
    {

        JTextArea textArea = new JTextArea(14,30);
        Font textFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textFont);


        float length, breadth,perSqrMeter;
        String name;


       //char picked = choice.charAt(0); //extract the String picked and convert it to char

        name = JOptionPane.showInputDialog("What is Your Name : ");

        length = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the length of the room: "));

        breadth = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the breadth of the room: "));

        perSqrMeter = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the cost per square metre of the carpet: "));

        //calculation for area

        float area = length * breadth;

        //calculation for total cost of carpet

        float cost = area * perSqrMeter;
        textArea.setText("Qoutation for " + name);




            textArea.append(String.format("\n%-40s%.2f m.\n%-40s%.2f m.\n%-40s%.2f sq. m.\n%-40s%.2f euro\n%-40s%.2f euro","Length of room: ",length,"Breadth of room: ",breadth,
                    "Total area of the room: ",area,"Cost per square metre of carpet: ",perSqrMeter,"Total cost of carpet: ",cost ));



        JOptionPane.showMessageDialog(null,  textArea , "Distance", JOptionPane.INFORMATION_MESSAGE);






        System.exit(0);
    }
}







