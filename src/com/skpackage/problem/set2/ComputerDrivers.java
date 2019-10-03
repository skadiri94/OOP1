package com.skpackage.problem.set2;

import javax.swing.*;

public class ComputerDrivers {

    public static void main(String[] args) {
        JTextArea jta = new JTextArea("          Computer Information\n\n");
        jta.setSize(14,30);

        Computer [] pc = new Computer[2];

        for(int i = 0; i < pc.length; i++){

            String make =  JOptionPane.showInputDialog(null,"Enter Make: ");

            String  type = JOptionPane.showInputDialog(null,"Enter type: ");

            float size = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter size: "));

            float value = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter Value: "));
             pc[i] = new Computer(make,type,size,value);

        }
        for(int i = 0; i < pc.length; i++) {
            jta.append(pc[i].toString());
        }
        JOptionPane.showMessageDialog(null,jta,"",JOptionPane.INFORMATION_MESSAGE);
    }
}
