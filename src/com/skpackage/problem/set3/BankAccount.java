package com.skpackage.problem.set3;


import com.skpackage.problem.set2.Person;

public abstract class BankAccount implements Transactable, Taxable {

    private String accNum;
    private Person customer;

    public BankAccount(){
        this("Empty","unknown name");

    }


    public BankAccount(String accNum, String name){

        setAccNum(accNum);
        customer = new Person(name);
    }

    public BankAccount(String accNum, double balance, Person cust){

        setAccNum(accNum);
        //setBalance(balance);
        setCustomer(cust);
    }

    public BankAccount(String accNum, double balance, String custName){

        setAccNum(accNum);
        //setBalance(balance);
        setCustomer(new Person(custName));
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }


    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    /*public void setBalance(double balance) {
        this.balance = balance;
    }
*/
    public String getAccNum() {
        return accNum;
    }

    /*public double getBalance() {
        return balance;
    }*/


    public String toString(){

        return String.format("Account Number: %s\nAccount Holder: %s",getAccNum(),customer);
    }



    public abstract void lodgeToAccount(double money);

    public abstract void withdraw(double money);

    public abstract double calcTax();

    /*public void lodgeToAccount(double money){

        balance += money;
    }

    public void withdraw(double money){
        balance -= money;
    }*/
}
