package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирует методы класса Fit
 *
 * @author Dvoeglazov Ivan (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */

public class FitTest {
    /**
     * Тестирует метод manWeight().
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, is(92D));
    }
    /**
     * Тестирует метод womanWeight().
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, is(69D));
    }
}