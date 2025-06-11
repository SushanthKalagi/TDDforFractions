package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionTest {

    @Test
    public void zeroPlusZero() throws Exception{
        Fraction sum = new Fraction(0).plus(new Fraction(0));

        assertEquals(0,sum.intValue());
    }
    @Test
    public void nonZeroPlusZero() throws Exception{
        final Fraction sum = new Fraction(3).plus(new Fraction(0));

        assertEquals(3, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(1));

        assertEquals(4, sum.intValue());
    }

    @Test
    public void negativeInputsAndNegativeOutputs() throws Exception{
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));

        assertEquals(-2,sum.intValue());
    }

    @Test
    public void nonTrivialButCommonDenominator() throws Exception{
        final Fraction sum = new Fraction(1,5).plus(new Fraction(2,5));

        assertEquals(3,sum.getNumerator());
        assertEquals(5,sum.getDenominator());
    }
}
