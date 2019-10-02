package com.skpackage.problem.set2;

public class Fraction {

    private int numerator;
    private int denominator;


    public Fraction(){

        this(0,1);
    }

    public Fraction(int numerator, int denominator){

        setNumerator(numerator);
        setDenominator(denominator);

    }

    public void setNumerator(int numerator){this.numerator = numerator;}

    public void setDenominator(int denominator){this.denominator = denominator;}

    public int getNumerator(){ return numerator; }

    public int getDenominator(){return denominator;}


    public String toString(){

        return getNumerator() +"/"+getDenominator();
    }

   // public Fraction add(Fraction a, Fraction b){
   public Fraction add(Fraction b){

        int num1 = this.getNumerator();
        int num2 = this.getDenominator();
        int num3 = b.getNumerator();
        int num4 = b.getDenominator();


        return new Fraction(num1 * num4 + num3*num2,num2*num4);

    }
    public Fraction sub(Fraction b){

        int num1 = this.getNumerator();
        int num2 = this.getDenominator();
        int num3 = b.getNumerator();
        int num4 = b.getDenominator();

        Fraction frn = new Fraction(num1 * num4 - num3*num2,num2*num4);
        return  frn;

    }
    public Fraction mult(Fraction b){

        int num1 = this.getNumerator();
        int num2 = this.getDenominator();
        int num3 = b.getNumerator();
        int num4 = b.getDenominator();


        return new Fraction(num1 * num3,num2*num4);

    }
    public Fraction div(Fraction b){

        int num1 = this.getNumerator();
        int num2 = this.getDenominator();
        int num3 = b.getNumerator();
        int num4 = b.getDenominator();


        return new Fraction(num1 * num4 ,num2*num3);

    }

}
