package com.skpackage.problem.set2;

import javax.swing.*;

public class VendingMachineDrivers {

    public static void main(String[] args) {

        VendingMachine vDM = new VendingMachine();

        vDM.insertToken(2);
        vDM.insertToken(2);
        vDM.insertToken(2);

        JOptionPane.showMessageDialog(null,"Cans Of Soda are : "+ vDM.getCansCount() +"\n" +
                                        "Amount of Tokens: " + vDM.getTokensCount(), "Vending Machine",JOptionPane.INFORMATION_MESSAGE);

        vDM.insertToken(2);
        vDM.insertToken(2);

        JOptionPane.showMessageDialog(null,"Cans Of Soda are : "+ vDM.getCansCount() +"\n" +
                "Amount of Tokens: " + vDM.getTokensCount(), "Vending Machine",JOptionPane.INFORMATION_MESSAGE);

    }
}
