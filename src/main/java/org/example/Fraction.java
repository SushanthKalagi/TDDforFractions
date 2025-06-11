package org.example;

public class Fraction {
    //public int integerValue;
    public final int numerator;
    public int denominator;

    public Fraction(int integerValue) {
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        // this.numerator = numerator;
        //this.denominator = denominator;

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction fract) {


        return new Fraction(this.numerator + fract.numerator, denominator);
    }

    public int getNumerator() {
        return numerator;

    }

    public int getDenominator() {
        return denominator;
    }

    public int intValue() {
        return numerator;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction fract = (Fraction) other;
            return this.numerator == fract.numerator
                    && this.denominator == fract.denominator;
        }
        return false;

    }
    @Override
    public String toString(){
        return String.format("%d/%d", numerator,denominator);
    }
}
