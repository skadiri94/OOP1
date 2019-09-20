package com.skspackage.problemset;

import javax.swing.*;
import java.awt.*;


public class Set1ex6 {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea(14, 30);
        Font textFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textFont);
        textArea.setText(String.format("%-20s%3s\n%-20s%3s\n", "Number", "Cube", "-----", "-----"));


        for (int i = 1; i <= 15; i++) {
            int numCube = MyMethods.xCube(i);

            textArea.append(String.format("%d%20d\n", i, numCube));


        }

        // textArea.append(String.format("%.2f",x));

        JOptionPane.showMessageDialog(null, textArea, "Cube Root", JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);

    }
}







