package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() throws Exception{
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerators() throws Exception{
        assertNotEquals(new Fraction(3,8), new Fraction(5,8));
    }

    @Test
    public void differentDenominators() throws Exception{
        assertNotEquals(new Fraction(3,8), new Fraction(3,9));
    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception{
        assertEquals(new Fraction(2,1), new Fraction(2,1));
    }

    @Test
    public void wholeNumberNotEqualsDifferentWholeNumber() throws Exception{
        assertNotEquals(new Fraction(2), new Fraction(3));
    }
}
