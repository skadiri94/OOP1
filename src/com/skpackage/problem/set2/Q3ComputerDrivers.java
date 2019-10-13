package com.skpackage.problem.set2;

import javax.swing.*;
import java.util.ArrayList;

public class Q3ComputerDrivers {

    public static void main(String[] args) {

            Laptop comp1 = new Laptop("Dell","SSD",500,true);
            Q3Computer comp2 = new Q3Computer("Asus","DDR",250);

        ArrayList<Q3Computer> computers = new ArrayList<Q3Computer>();

        //computer.makeLaptop();

        System.out.println(comp1.toString());

        computers.add(comp1);
        computers.add(comp2);

        JOptionPane.showMessageDialog(null,computers.toString(),"Computer details",JOptionPane.INFORMATION_MESSAGE);

    }
}
