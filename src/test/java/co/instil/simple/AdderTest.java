/*
 * Copyright 2015 Instil.
 */
package co.instil.simple;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.fail;

/**
 * Simple test class for adding numbers.
 */
public class AdderTest {

    private final Adder adder = new Adder();

    @Test
    public void shouldAddNumbers() {
        assertThat(adder.add(12, 19), is(equalTo(31)));
    }

    @Test
    public void shouldThrowExceptionWhenAddingNullValue() {
        try {
            adder.add(12, null);
            fail("Should have thrown exception");
        } catch (NullPointerException e) {
            // Insert statement here so we don't have an empty block
        }
    }

    @Test
    public void shouldIndicateNumbersEqual() {
        assertThat(adder.equals(12, 12), is(true));
    }

    @Test
    public void shouldIndicateNumbersNotEqual() {
        assertThat(adder.equals(12, 19), is(false));
    }
}
