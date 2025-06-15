package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerators() {
        assertNotEquals(new Fraction(3,8), new Fraction(5,8));
    }

    @Test
    public void differentDenominators() {
        assertNotEquals(new Fraction(3,8), new Fraction(3,9));
    }

    @Test
    public void wholeNumberEqualsSameFraction() {
        assertEquals(new Fraction(2,1), new Fraction(2,1));
    }

    @Test
    public void wholeNumberNotEqualsDifferentWholeNumber() {
        assertNotEquals(new Fraction(2), new Fraction(3));
    }
}
