package com.skspackage.problemset;

import javax.swing.*;
import java.awt.*;


public class Set1ex8 {
    public static void main(String[] args) {

        int[] num = new int[10];

        JTextArea textArea = new JTextArea(14, 30);
        Font textFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textFont);
        textArea.setText(String.format("%-20s%3s\n%-20s%3s\n", "Number", "Cube", "-----", "-----"));

        for(int i = 0; i < 10; i++) {

            num[i] = Integer.parseInt(JOptionPane.showInputDialog("enter a number :\n"));

        }



        JOptionPane.showMessageDialog(null, "The first Value in the array is " + num[0] +
                "\nThe 5th Value in the array is " + num[4], "Arrays", JOptionPane.INFORMATION_MESSAGE);



        // textArea.append(String.format("%.2f",x));




        System.exit(0);

    }
}







