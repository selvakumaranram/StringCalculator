package org.craftsMansTDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void returnZeroIfItisEmptyString() {
        assertEquals(0, stringCalculator.addStringNumbers(""));
    }

    @Test
    public void returnSingleNumber() {
        assertEquals(1, stringCalculator.addStringNumbers("1"));
    }

    @Test
    public void returnTwoNumbersWithComma() {
        assertEquals(6, stringCalculator.addStringNumbers("1,5"));
    }

    @Test
    public void testNegativeNumbers() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            stringCalculator.addStringNumbers("1,-2,3,-4");
        });
        assertEquals("Negative numbers not allowed: [-2, -4]", exception.getMessage());
    }

     @Test
    public void testNewLinesBetweenNumbers() {
        assertEquals(6, stringCalculator.addStringNumbers("1\n2,3"));
    }

    @Test
    public void testSemicolon() {
        assertEquals(10, stringCalculator.addStringNumbers("1;5;4"));
    }

    @Test
    public void testCustomCheck() {
        assertEquals(18, stringCalculator.addStringNumbers("//;\n1;\n\n2\n15"));
    }

    @Test
    public void returnZeroIfItisMoreThanThousand() {
        assertEquals(501, stringCalculator.addStringNumbers("1;500\n2500"));
    }
}
