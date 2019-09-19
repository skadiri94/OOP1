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
        double x1,x2,x;

        //The formular for x which can be either in - or +

        x1 = (-b + Math.sqrt((b*b) - (4*a *c)))/ (2*a);
        x2 = (-b - Math.sqrt((b*b) - (4*a *c)))/ (2*a);

        x = (x2*x2)+ 6* x2 -16;

        //textArea.append(String.format("%.2f\n%.2f",x1,x2));

        textArea.append(String.format("\nChecking Roots Answer is %.2f",x));

        JOptionPane.showMessageDialog(null,  textArea , "Distance", JOptionPane.INFORMATION_MESSAGE);






        System.exit(0);
    }

    private static int cube(int a){

       return a * a * a;

       // return numCube;
    }
}







