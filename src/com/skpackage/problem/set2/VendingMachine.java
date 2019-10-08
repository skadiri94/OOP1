package com.skpackage.problem.set2;

public class VendingMachine {
    private int cansOfSoda;
    private int tokens;
    //private static int cansCount = 0;
    //private static int tokensCount = 0;

    public  VendingMachine(){

        setCansOfSoda(100);
        setTokens(0);
    }

    public  VendingMachine(int cans, int tokens){

        setCansOfSoda(cans);
        setTokens(tokens);
        //cansCount++;
        //tokensCount++;
    }

    public void setCansOfSoda(int cansOfSoda) {
        this.cansOfSoda = cansOfSoda;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    /*public static void setCansCount(int cansCount) {
        VendingMachine.cansCount = cansCount;
    }

    public static void setTokensCount(int tokensCount) {
        VendingMachine.tokensCount = tokensCount;
    }*/

    public int getCansOfSoda() {
        return cansOfSoda;
    }

    public int getTokens() {
        return tokens;
    }

    /*public  int getCansCount() {
        return this.cansOfSoda;
    }

    public  int getTokensCount() {
        return this.tokens;
    }*/

    public void fillUp(int cans){

        cansOfSoda += cans;
    }

    public void insertToken(){

        tokens++;
        cansOfSoda--;

    }




}
