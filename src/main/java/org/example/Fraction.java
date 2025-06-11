package org.example;

public class Fraction {
    public final int integerValue;
    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction fract) {


        return new Fraction(this.integerValue + fract.integerValue);
    }

    public int intValue() {
        return integerValue;
    }
}
