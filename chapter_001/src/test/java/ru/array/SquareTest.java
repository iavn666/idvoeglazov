package ru.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void calculate() {
        Square calc = new Square();
        int[] result = calc.calculate(5);
        int[] expected = new int[] {1, 4, 9, 16, 25, 36};
        assertThat(result, is(expected));
            }
}
