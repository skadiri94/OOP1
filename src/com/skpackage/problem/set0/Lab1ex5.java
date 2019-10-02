package com.skpackage.problem.set0;

import javax.swing.*;


public class Lab1ex5 {
    public static void main (String[]args)
    {
        float result;

       String choice = JOptionPane.showInputDialog(null, "A (for addition)" +
                "\nS (for subtraction)" + " \nM (for multiplication)" +
                    "\nD (for division)" + "\n\nWhat Operation do you Desire:\n",
        "Calculator ", JOptionPane.INFORMATION_MESSAGE);

        Float num = Float.parseFloat(JOptionPane.showInputDialog("enter a number :\n"));

        Float num2 = Float.parseFloat(JOptionPane.showInputDialog("enter another number :\n"));

       char picked = choice.charAt(0); //extract the String picked and convert it to char

        switch (picked){
            case 'A':
                result = num + num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);

                break;
            case 'S':
                result = num - num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'M':
                result = num * num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'D':
                result = num/num2;
                JOptionPane.showMessageDialog(null, "Result of Operation is : " + result, "Addition", JOptionPane.INFORMATION_MESSAGE);
                break;


            default:
                // statements

        }


        System.exit(0);
    }
}







