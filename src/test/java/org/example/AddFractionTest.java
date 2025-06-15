package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionTest {

    @Test
    public void zeroPlusZero()  {
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));

        assertEquals(3, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands()  {
        final Fraction sum = new Fraction(3).plus(new Fraction(1));

        assertEquals(4, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() {
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));

        assertEquals(-2, sum.intValue());
    }

    @Test
    public void nonTrivialButCommonDenominator() {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));

        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }

    @Test
    public void nonTrivialAndNonCommonDenominator()  {
        final Fraction sum = new Fraction(1, 2).plus(new Fraction(1, 3));

        assertEquals(5, sum.getNumerator());
        assertEquals(6, sum.getDenominator());
    }

    @Test
    public void reducedFraction() {
        final Fraction sum = new Fraction(2, 4).plus(new Fraction(1, 2));

        assertEquals(1, sum.getNumerator());
        assertEquals(1, sum.getDenominator());
    }

    @Test
    public void negativeDenominator()  {
        final Fraction sum = new Fraction(2, 7).plus(new Fraction(1, -3));

        assertEquals(-1, sum.getNumerator());
        assertEquals(21, sum.getDenominator());
    }
}
