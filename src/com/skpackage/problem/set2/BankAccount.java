package com.skpackage.problem.set2;


public class BankAccount {

    private String accNum;
    private double balance;
    private Person customer;

    public BankAccount(){
        this("Empty",0.0,"unknown name");

    }


    public BankAccount(String accNum, double balance, String name){

        setAccNum(accNum);
        setBalance(balance);
        customer = new Person(name);
    }

    public BankAccount(String accNum, double balance, Person cust){

        setAccNum(accNum);
        setBalance(balance);
        setCustomer(cust);
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

        return String.format("Account Number: %s\nBalance:€ %.2f\nAccount Holder: %s",getAccNum(),getBalance(),customer);
    }

    public void lodgeToAccount(double money){

        balance += money;
    }

    public void withdraw(double money){
        balance -= money;
    }
}
