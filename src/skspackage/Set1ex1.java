package skspackage;

import javax.swing.*;


public class Set1ex1 {
    public static void main (String[]args)
    {
        float gbp;


       //char picked = choice.charAt(0); //extract the String picked and convert it to char
         gbp = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter an Amount :\n","1 GBP = 1.12877 EUR", JOptionPane.INFORMATION_MESSAGE));

        while(gbp != 0) {

    float euro = gbp * 1.12877f;

            JOptionPane.showMessageDialog(null,  String.format("%-5s%.2f\n%-5s%.2f","EUR",euro,"GBP",gbp), "Convertion", JOptionPane.INFORMATION_MESSAGE);

            gbp = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter an Amount :\n","1 GBP = 1.12877 EUR", JOptionPane.INFORMATION_MESSAGE));




        } //end while

        System.exit(0);
    }
}







