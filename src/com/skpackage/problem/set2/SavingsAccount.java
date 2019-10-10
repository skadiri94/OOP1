package com.skpackage.problem.set2;

public class SavingsAccount extends BankAccount {



    private double balance;

    public SavingsAccount(){
        setBalance(0.0);
    }

    public SavingsAccount(double balance, String accNum, String name){

        super(accNum,name);

        setBalance(balance);

    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void lodgeToAccount(double money){

        balance += money;
    }

    public void withdraw(double money){
        balance -= money;
    }

    public double calcTax(){

        return this.balance -= (balance*0.10);

    }

    public String toString(){

        return super.toString();
    }

}
