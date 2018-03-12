package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial calcu = new Factorial();
        int result = calcu.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial one = new Factorial();
        int result = one.calc(0);
        int expected = 1;
        assertThat(result, is(expected));

        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}
