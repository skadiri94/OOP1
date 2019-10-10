package com.skpackage.problem.set2;

import javax.swing.*;

public class CreateBankAccount {

    public static void main(String[] args) {

        BankAccount myAccount = new SavingsAccount(1000, "afdfa4534564","Kasey Hislop");

        JOptionPane.showMessageDialog(null,myAccount.toString(),"Bank Account Details",JOptionPane.INFORMATION_MESSAGE);


System.exit(0);

    }
}
