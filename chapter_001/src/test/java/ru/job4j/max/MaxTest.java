package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 0.1
 */

public class MaxTest {
    /**
     * Тестирует метод whenFirstLessSecond.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    /**
     * Тестирует метод whenFirstmoreSecon.
     */
    @Test
    public void whenFirstmoreSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(1));
    }
    /**
     * Тестирует метод whenFirstequallySecond.
     */
    @Test
    public void whenFirstequallySecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 2);
        assertThat(result, is(2));
    }

}
