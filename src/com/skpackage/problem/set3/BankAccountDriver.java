package com.skpackage.problem.set3;

import com.skpackage.problem.set2.Person;

import javax.swing.*;
import java.util.ArrayList;

public class BankAccountDriver {
    public static void main(String[] args) {

        //int i = 0;

        //SavingsAccount[] newBankAccounts = new SavingsAccount[2];

        ArrayList<SavingsAccount> newBankAccounts = new ArrayList<>();
        //Person [] newPerson = new Person[2];
        String name, accNum;
        double accBal;


        while (JOptionPane.showConfirmDialog(null, "Creat a New Bank Account") == JOptionPane.YES_OPTION) {
            name = JOptionPane.showInputDialog(null, "Enter Account Holder Name:");

            // newPerson[i] = new Person(name);

            accNum = JOptionPane.showInputDialog(null, "Enter Account Number: ");

            accBal = Double.parseDouble(JOptionPane.showInputDialog("Enter Account Balance: "));

            newBankAccounts.add(new SavingsAccount(accBal, accNum, name));




           // i++;

        }


        String bAcc = "";


        //for (int j = 0; j < i; j++)

        for(SavingsAccount bk: newBankAccounts){

            //h++;
           // bAcc += newBankAccounts.toString();
           // bAcc += newBankAccounts[bk]

            bAcc += bk.toString() + "\n\n\n";


        }

        System.out.println(bAcc);


        JOptionPane.showMessageDialog(null, bAcc, "Bank Details",JOptionPane.INFORMATION_MESSAGE);


    }
}
/*
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

 */

