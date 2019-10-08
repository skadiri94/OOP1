package com.skpackage.problem.set2;

import javax.swing.*;

public class VendingMachineDrivers {

    public static void main(String[] args) {

        VendingMachine vDM = new VendingMachine();

        vDM.insertToken();

        JOptionPane.showMessageDialog(null,"Cans Of Soda are : "+ vDM.getCansOfSoda() +"\n" +
                "Amount of Tokens: " + vDM.getTokens(), "Vending Machine",JOptionPane.INFORMATION_MESSAGE);

        vDM.insertToken();
        vDM.insertToken();

        JOptionPane.showMessageDialog(null,"Cans Of Soda are : "+ vDM.getCansOfSoda() +"\n" +
                                        "Amount of Tokens: " + vDM.getTokens(), "Vending Machine",JOptionPane.INFORMATION_MESSAGE);

        vDM.insertToken();
        vDM.insertToken();

        JOptionPane.showMessageDialog(null,"Cans Of Soda are : "+ vDM.getCansOfSoda() +"\n" +
                "Amount of Tokens: " + vDM.getTokens(), "Vending Machine",JOptionPane.INFORMATION_MESSAGE);

    }
}
