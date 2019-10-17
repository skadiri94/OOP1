package com.skpackage.problem.set3;

import javax.swing.*;
import java.util.ArrayList;

public class Q3ComputerDrivers {

    public static void main(String[] args) {
        JTextArea jta = new JTextArea("Computer Details\n\n");

            Laptop comp1 = new Laptop("12345","Dell","SSD",500,true);
            Q3Computer comp2 = new Q3Computer("564564","Asus","DDR",250);

        ArrayList<Q3Computer> computers = new ArrayList<Q3Computer>();

        Laptop comp3 = new Laptop();

        comp3 = comp3.makeLaptop();



        System.out.println(comp1.toString());

        computers.add(comp1);
        computers.add(comp2);
        computers.add(comp3);

        for(int i=0;i<computers.size();i++) {

            jta.append(computers.get(i).toString() +"\n\n");

        }
        JOptionPane.showMessageDialog(null,jta,"Computer details",JOptionPane.INFORMATION_MESSAGE);

    }
}
