package skspackage;

import javax.swing.*;
import java.awt.*;


public class Set1ex5 {
    public static void main (String[]args)
    {

        JTextArea textArea = new JTextArea(14,30);
        Font textFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textFont);


        float a = 1,b = 6,c = -16;
        double x;

        x = -b + Math.sqrt((b*b) - (4*a *c)) / 2* a;

        textArea.append(String.format("%.2f",x));

        JOptionPane.showMessageDialog(null,  textArea , "Distance", JOptionPane.INFORMATION_MESSAGE);






        System.exit(0);
    }

    private static int cube(int a){

       return a * a * a;

       // return numCube;
    }
}







