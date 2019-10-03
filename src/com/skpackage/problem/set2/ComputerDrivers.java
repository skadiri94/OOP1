package com.skpackage.problem.set2;

import javax.swing.*;

public class ComputerDrivers {

    public static void main(String[] args) {
        JTextArea jta = new JTextArea("          Computer Information\n\n");
        jta.setSize(14,30);

        Computer pc = new Computer("MacBook","Laptop",15.5f,3000);

        jta.append(pc.toString());

        JOptionPane.showMessageDialog(null,jta,"",JOptionPane.INFORMATION_MESSAGE);
    }
}
