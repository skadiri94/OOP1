package com.skpackage.problem.set2;

import javax.swing.*;

public class MyPointDrivers {

    public static void main(String[] args) {

        JTextArea jta = new JTextArea("Distance Between Points\n");
        MyPoint point = new MyPoint();

        point.moveHorizontally(2);
        point.translate(2,4);
        point.moveVertically(-2);

        jta.append("Point" + point.toString());

        JOptionPane.showMessageDialog(null, jta,"",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
