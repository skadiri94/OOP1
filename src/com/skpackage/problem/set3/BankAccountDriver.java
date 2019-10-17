package com.skpackage.problem.set3;

import com.skpackage.problem.set2.Person;

import javax.swing.*;

public class BankAccountDriver {
    public static void main(String[] args) {

        int i=0;

        BankAccount[] newBankAccounts = new BankAccount[10];
        Person [] newPerson = new Person[10];
        String name,accNum;
        double accBal;


        while(JOptionPane.showConfirmDialog(null,"Creat a New Bank Account")==JOptionPane.YES_OPTION)
        {
            name = JOptionPane.showInputDialog(null,"Enter Account Holder Name:");

            newPerson[i] = new Person(name);

            accNum = JOptionPane.showInputDialog(null,"Enter Account Number: ");

            accBal = Double.parseDouble(JOptionPane.showInputDialog("Enter Account Balance: "));

            newBankAccounts[i] = new BankAccount(accNum, accBal, newPerson[i]) {
                @Override
                public void lodgeToAccount(double money) {

                }

                @Override
                public void withdraw(double money) {

                }

                @Override
                public double calcTax() {
                    return 0;
                }
            };

            i++;

        }


        String bAcc = "";


        for (int j = 0; j < i; j++) {


            bAcc += newBankAccounts[j].toString() + "\n\n\n";


        }


        JOptionPane.showMessageDialog(null, bAcc, "Bank Details",JOptionPane.INFORMATION_MESSAGE);


    }
}
