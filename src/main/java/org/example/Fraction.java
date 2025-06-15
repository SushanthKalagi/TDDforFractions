package org.example;

public class Fraction {
    //public int integerValue;
    public final int numerator;
    public final int denominator;

    public Fraction(int integerValue) {
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        // this.numerator = numerator;
        //this.denominator = denominator;


        if (denominator < 0) {
            numerator = -1 * numerator;
           denominator = Math.abs(denominator);
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }


    public Fraction plus(Fraction fract) {


        int newNumerator = this.numerator * fract.denominator + fract.numerator * this.denominator;
        int newDenominator = this.denominator * fract.denominator;
        return new Fraction(newNumerator, newDenominator);


    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int getNumerator() {
        return numerator;

    }

    public int getDenominator() {
        return denominator;
    }

    public int intValue() {
        return numerator / denominator;
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
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
