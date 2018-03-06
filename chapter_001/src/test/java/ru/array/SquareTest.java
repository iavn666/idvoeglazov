package ru.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void calculate() {
        Square calc = new Square();
        int[] result = calc.calculate(6);
        int expected = 1;
        assertThat(result, is(expected));
            }
}
