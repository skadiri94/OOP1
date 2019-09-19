package skspackage;

import javax.swing.*;
import java.awt.*;


public class Set1ex7 {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea(14, 30);
        Font textFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textFont);
        textArea.setText(String.format("%-20s%3s\n%-20s%3s\n", "Number", "Cube", "-----", "-----"));

            int num = Integer.parseInt(JOptionPane.showInputDialog("enter a number :\n"));

        while (num != -1) {

            if (MyMethods.isEven(num))
                JOptionPane.showMessageDialog(null, num +
                        " is  an Even Number", "Even Number", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, num +
                        " is an Odd Number", "Odd Number", JOptionPane.INFORMATION_MESSAGE);


             num = Integer.parseInt(JOptionPane.showInputDialog("enter a number :\n"));

        }

        // textArea.append(String.format("%.2f",x));




        System.exit(0);

    }
}







