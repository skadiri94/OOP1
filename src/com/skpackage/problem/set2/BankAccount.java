package com.skpackage.problem.set2;


public class BankAccount {

    private String accNum;
    private double balance;
    private Person customer;

    public BankAccount(){
        this("Emptpy",0.0,null);

    }


    public BankAccount(String accNum, double balance, Person customer){

        setAccNum(accNum);
        setBalance(balance);
        customer = new Person();
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }


    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }


    public String toString(){

        return String.format("Account Number: %s\nBalance:€ %s\nAccount Holder: %.2f",getAccNum(),getBalance(),customer);
    }
}
