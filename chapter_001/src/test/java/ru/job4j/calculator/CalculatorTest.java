package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирует методы класса Calculator
 *
 * @author Dvoeglazov Ivan (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */

public class CalculatorTest {
    /**
     * Тестирует метод addition().
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.addition(1D,1D );
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Тестирует метод subtraction().
     */
    @Test
    public void whenAddOnesubtractionOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtraction(1D,1D );
        double result = calc.getResult();
        double expected = 0D;
        assertThat(result, is(expected));
    }
    /**
     * Тестирует метод multi().
     */
    @Test
    public void whenAddOnemultiOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multi(1D,1D );
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Тестирует метод segmentation().
     */
    @Test
    public void whenAddOnesegmentationOneThenTwo() {
        Calculator calc = new Calculator();
        calc.segmentation(1D,1D );
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

}

