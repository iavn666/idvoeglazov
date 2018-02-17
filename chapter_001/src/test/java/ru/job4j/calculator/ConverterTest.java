package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тестирует методы класса Converter
 *
 * @author Dvoeglazov Ivan (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */

public class ConverterTest {
    /**
     * Тестирует метод rubleToDollar().
     */
    @Test
        public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(120);
        assertThat(result, is(2));
    }

    /**
     * Тестирует метод rubleToDollar().
     */
    @Test
    public void RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(140);
        assertThat(result, is(2));
    }

    /**
     * Тестирует метод DollarTorubli().
     */
    @Test
    public void whenEuroTorubli() {
        Converter converter = new Converter();
        int result = converter.DollarTorubli(1);
        assertThat(result, is(60));
    }

    /**
     * Тестирует метод EuroTorubli().
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.EuroTorubli(1);
        assertThat(result, is(70));
    }


}
