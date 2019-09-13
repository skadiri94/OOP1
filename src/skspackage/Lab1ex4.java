package skspackage;

import javax.swing.*;


public class Lab1ex4 {
    public static void main (String[]args)
    {
        String num= "" ;


        Integer count = 0;
        Float numAsNum, total=0f;

        num = JOptionPane.showInputDialog("enter a number – positive, negative, or zero");

        while(!num.equals("q") ){



            numAsNum = Float.parseFloat(num);

            total += numAsNum;

            count ++;

            num = JOptionPane.showInputDialog("enter a number – positive, negative, or zero");

        }

        JOptionPane.showMessageDialog(null, "Total of the numbers : " + total + "\nInput count : " + count, "Tax Info: ", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}







