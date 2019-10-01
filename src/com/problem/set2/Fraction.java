package com.problem.set2;

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

    public Fraction add(Fraction a, Fraction b){

        return a + b;
    }

}
