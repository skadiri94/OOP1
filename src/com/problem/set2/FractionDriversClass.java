package com.problem.set2;

import javax.swing.*;

public class FractionDriversClass {

    public static void main (String[]args){

        Fraction frst = new Fraction(15,25);
        Fraction snd = new Fraction(10,20);


        JOptionPane.showInternalMessageDialog(null,"Value of " + frst.toString() + " + " + snd.toString() +" is " + frst.add(snd) +
                "\nValue of " + frst.toString() + " - " + snd.toString() +" is " +  frst.sub(snd)+
                "\nValue of " + frst.toString() + " * " + snd.toString() +" is " + frst.mult(snd)+
                "\nValue of " + frst.toString() + " / " + snd.toString() +" is "+ frst.div(snd),"Fraction",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
